package org.myfly.platform.core.process.define;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.myfly.platform.core.datamodel.builder.AbstractBuilder;
import org.myfly.platform.core.datamodel.define.FElement;
import org.myfly.platform.core.datamodel.define.FlyMemoryDataModel;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.process.annotation.FlyProcess;
import org.myfly.platform.core.process.annotation.FlyProcessParam;
import org.myfly.platform.core.process.model.PProcess;
import org.myfly.platform.core.process.service.ProcessCall;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.util.StringUtils;

public class FlyProcessModelBuilder extends AbstractBuilder<PProcess, FlyProcessModel> {

	@Override
	public FlyProcessModel convert(PProcess builder) {
		return null;
	}

	@Override
	public List<FlyProcessModel> convertProcessClass(Class<? extends ProcessCall> processClass) {
		List<FlyProcessModel> result = new ArrayList<>();
		FlyProcess anno = processClass.getAnnotation(FlyProcess.class);
		if (anno != null) {
			FlyProcessModel process = buildProcess(anno);
			process.setApiName(processClass.getName());
			process.setProcessID(UUIDUtil.newUUID());
			process.setName(anno.name());
			process.setDescription(anno.description());
			process.setParas(buildProcessParas(process, processClass));
			FlyEntityUtils.updateFlyEntityForSystem(process);
			result.add(process);
		}
		return result;
	}

	private Map<String, FProcessPara> buildProcessParas(FlyProcessModel process,
			Class<? extends ProcessCall> processClass) {
		Map<String, FProcessPara> paras = new LinkedHashMap<>();
		ClassUtil.getFieldsByAnnotation(processClass, FlyProcessParam.class).forEach(field -> {
			FProcessPara para = buildProcessPara(field);
			para.setProcessID(process.getProcessID());
			paras.put(field.getName(), para);
		});
		return paras;
	}

	private FProcessPara buildProcessPara(Field field) {
		FlyProcessParam anno = field.getAnnotation(FlyProcessParam.class);
		FProcessPara result = new FProcessPara();
		result.setProcessParaID(UUIDUtil.newUUID());
		result.setApiName(field.getName());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		String elementName = StringUtils.hasLength(anno.element()) ? anno.element() : result.getApiName();
		FElement element = FlyMemoryDataModel.getInstance().getElements().get(elementName);
		if (element != null) {
			result.setElement(element);
			result.setElementID(element.getElementID());
			if (!StringUtils.hasLength(result.getName())) {
				result.setName(element.getName());
			}
			if (!StringUtils.hasLength(result.getDescription())) {
				result.setDescription(element.getDescription());
			}
			if (!StringUtils.hasLength(result.getHelp())) {
				result.setHelp(element.getHelp());
			}
			result.setEntityType(element.getEntityType());
			result.setDataType(element.getDataType());
			result.setColumnName(element.getColumnName());
			result.setFieldLength(element.getFieldLength());
			result.setReferenceID(element.getReferenceID());
		} else {
			result.setHelp("没有找到名称为[" + elementName + "]的系统元素.");
		}
		return result;
	}

	private FlyProcessModel buildProcess(FlyProcess anno) {
		FlyProcessModel result = new FlyProcessModel();
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<FlyProcessModel> loadFromProcessPackage(String packageName) {
		List<FlyProcessModel> result = new ArrayList<>();
		ClassUtil.getClassesByAnnotation(packageName, FlyProcess.class).forEach(item -> {
			result.addAll(loadFromProcessClass((Class<? extends ProcessCall>) item));
		});
		return result;
	}

}
