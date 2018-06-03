package org.myfly.platform.system.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.domain.AlertInfo;
import org.myfly.platform.core.domain.AlertLevel;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.FileUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.domain.Attachment;
import org.myfly.platform.visualpage.domain.PageInfo;
import org.myfly.platform.visualpage.service.BaseViewController;
import org.myfly.platform.visualpage.service.VisualPageConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 提供文件上传下载
 * 
 * @author xiangwanhong
 *
 */
@Controller
@RequestMapping("/file")
public class FileController extends BaseViewController {
	private static final Log log = LogFactory.getLog(FileController.class);

	@RequestMapping()
	@ResponseBody
	public Map<String, String> help() {
		Map<String, String> map = new HashMap<>();
		map.put("/file/showUpload/{parentId}", "显示附件上传页面");
		map.put("/file/upload?processUrl={processUrl} [POST]", "将上传文件保存到临时目录，并转向processUrl进行后续处理");
		map.put("/file/attachment/{parentId}/{uploadDir} [GET|POST]", "将临时目录下文件保存到附件中");
		map.put("/file/download?fileName={fileName}", "从临时目录下载指定文件");
		map.put("/file/download/{uid}", "下载指定附件");
		return map;
	}

	/**
	 * 提供文件下载服务
	 * 
	 * @param fileName
	 *            文件名，相对于临时目录的路径
	 * @param request
	 * @param response
	 */
	@RequestMapping("download")
	public ModelAndView downLoadFile(@RequestParam(name = "fileName", required = true) String fileName,
			HttpServletRequest request, HttpServletResponse response) {
		// 通过文件路径获得File对象
		File file = new File(FileUtils.getTempDirectoryPath() + fileName);
		log.debug("下载文件：" + file.getAbsolutePath());
		if (!file.exists() || file.isDirectory()) {
			log.warn("下载文件不存在，或是目录.");
			return showError("下载文件", new String[] { "下载文件不存在，或是目录." });
		}

		// 1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
		response.setContentType("multipart/form-data");
		// 2.设置文件头：最后一个参数是设置下载文件名
		response.setHeader("Content-Disposition", "attachment;fileName=" + file.getName());
		ServletOutputStream out;
		try {
			FileInputStream inputStream = new FileInputStream(file);

			// 3.通过response获取ServletOutputStream对象(out)
			out = response.getOutputStream();

			byte[] buffer = new byte[1024];
			int i = -1;
			while ((i = inputStream.read(buffer)) != -1) {
				out.write(buffer, 0, i);
			}

			inputStream.close();
			out.close();
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 下载指定附件
	 * 
	 * @param uid
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = { "download/{uid}" })
	public ModelAndView downLoadAttachment(@PathVariable("uid") String uid, HttpServletRequest request,
			HttpServletResponse response) {
		String entityName = Attachment.class.getName();
		Attachment attachment = AppUtil.getFlyDataAccessService(entityName).findOne(entityName, uid);
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName=" + attachment.getName());
		try {
			ServletOutputStream out = response.getOutputStream();
			out.write(attachment.getBody());
			out.close();
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 通用blob下载
	 * 
	 * @param entityName
	 * @param uid
	 * @param blobField
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = { "download/{entityName}/{uid}/{blobField}" })
	public ModelAndView downloadBlobField(@PathVariable("entityName") String entityName,
			@PathVariable("uid") String uid, @PathVariable("blobField") String blobField, HttpServletRequest request,
			HttpServletResponse response) {
		return null;
	}

	/**
	 * 文件上传，将上传文件保存在临时目录。processUrl如果不为空，表示有后续处理
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "upload", method = { RequestMethod.POST })
	public ModelAndView uploadFiles(@RequestParam(name = "processUrl", required = false) String processUrl,
			HttpServletRequest request, HttpServletResponse response) {
		String uploadDir = UUIDUtil.newUUID();
		List<String> errors = saveUploadFilesToTempDir(request, uploadDir);
		if (errors.size() == 0) {
			if (StringUtils.isEmpty(processUrl)) {
				try {
					response.getWriter().write("{}");
					setUserAlertInfo(new AlertInfo(AlertLevel.SUCCESS, "文件上传成功."));
				} catch (IOException e) {
				}
				return null;
			} else {
				return forwardTo(processUrl + "/" + uploadDir);
			}
		} else {
			setUserAlertInfo(new AlertInfo(AlertLevel.DANGER, "文件上传失败.", errors.toArray(new String[] {})));
			return null;
		}
	}

	/**
	 * 保存附件到指定目录
	 * 
	 * @param request
	 * @param uploadDir
	 * @return
	 */
	private List<String> saveUploadFilesToTempDir(HttpServletRequest request, String uploadDir) {
		String uploadPath = FileUtils.getTempDirectoryPath() + uploadDir + File.separatorChar;
		(new File(uploadPath)).mkdir();
		// 创建一个通用的多部分解析器
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		List<String> errors = new ArrayList<>();
		// 判断 request 是否有文件上传,即多部分请求
		if (multipartResolver.isMultipart(request)) {
			// 转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 取得request中的所有文件名
			Set<String> iter = multiRequest.getFileMap().keySet();
			for (String partName : iter) {
				// 取得上传文件
				List<MultipartFile> files = multiRequest.getFiles(partName);
				for (MultipartFile file : files) {
					// 记录上传过程起始时的时间，用来计算上传时间
					int pre = (int) System.currentTimeMillis();
					// 取得当前上传文件的文件名称
					String myFileName = file.getOriginalFilename();
					log.debug("保存上传文件[" + myFileName + "]到目录[" + uploadPath + "].");
					// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
					if (myFileName.trim() != "") {
						// 重命名上传后的文件名
						String fileName = file.getOriginalFilename();
						// 定义上传路径
						String newFile = uploadPath + fileName;
						File localFile = new File(newFile);
						try {
							file.transferTo(localFile);
						} catch (Exception e) {
							String message = "上传文件[" + newFile + "]保存失败，错误信息：" + e.getMessage();
							log.error(message);
							errors.add(message);
						}
					}
					// 记录上传该文件后的时间
					int finaltime = (int) System.currentTimeMillis();
					log.info("上传文件[" + myFileName + "]处理耗时[" + ((finaltime - pre) / 1000) + "]毫秒");
				}
			}
		}
		return errors;
	}

	/**
	 * 显示附件上传界面，导入提交到/file/upload，
	 * 
	 * @param table
	 * @param request
	 * @return
	 */
	@RequestMapping(value = { "showUpload/{parentId}" }, method = RequestMethod.GET)
	public ModelAndView showUpload(@PathVariable("parentId") String parentId, HttpServletRequest request) {
		if (log.isDebugEnabled()) {
			log.debug("showUpload, parentId=" + parentId);
		}
		PageInfo pageInfo = getBasePageInfo("上传附件", "attachment", VisualPageConstants.COMMON_TEMPLATE_IMPORT);

		ModelAndView mv = getBaseModelAndView();
		mv.addObject("pageInfo", pageInfo);
		mv.addObject("processUrl", "/file/attachment/" + parentId + "/");
		return mv;
	}

	@RequestMapping(value = { "showUpload" }, method = RequestMethod.GET)
	public ModelAndView showUpload(HttpServletRequest request) {
		return showUpload(null, request);
	}

	/**
	 * 保存uploadDir目录下的文件到附件表中
	 * 
	 * @param parentId
	 * @param uploadDir
	 * @return
	 */
	@RequestMapping(value = { "attachment/{parentId}/{uploadDir}" }, method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String processUploadedAttachmentFile(@PathVariable("parentId") String parentId,
			@PathVariable("uploadDir") String uploadDir) {
		AssertUtil.parameterEmpty(uploadDir, "uploadDir");
		try {
			saveUploadFile(uploadDir, parentId);
			setUserAlertInfo(new AlertInfo(AlertLevel.SUCCESS, "附件上传成功."));
			return "{}";
		} catch (Exception e) {
			e.printStackTrace();
			setUserAlertInfo(new AlertInfo(AlertLevel.DANGER, "附件上传成功.", e.getMessage()));
			return "{}";
		}
	}

	/**
	 * 保存目录下的文件到附件中
	 * 
	 * @param uploadDir
	 * @param parentId
	 */
	private void saveUploadFile(String uploadDir, String parentId) {
		File file = new File(FileUtils.getTempDirectoryPath() + uploadDir);
		if (!file.exists() || file.isFile()) {
			AssertUtil.parameterInvalide(uploadDir, "上传文件目录参数[uploadDir]不是有效地目录");
		}
		Collection<File> files = FileUtils.listFiles(file, null, false);
		for (File tmpFile : files) {
			Attachment entity = new Attachment();
			entity.setName(tmpFile.getName());
			entity.setParentId(parentId);
			entity.setContentType(FileUtil.getFileExtention(entity.getName()));
			byte[] body = null;
			try {
				body = FileUtils.readFileToByteArray(tmpFile);
				entity.setBody(body);
				entity.setBodyLength(body.length);
			} catch (IOException e) {
				e.printStackTrace();
			}
			AppUtil.getFlyDataAccessService(Attachment.class.getName()).saveEntity(entity);
		}
	}
}
