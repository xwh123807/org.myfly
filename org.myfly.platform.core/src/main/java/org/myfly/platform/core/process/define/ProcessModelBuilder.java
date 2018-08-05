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

public class ProcessModelBuilder extends AbstractBuilder<PProcess, ProcessModel> {

	@Override
	public ProcessModel convert(PProcess builder) {
		return null;
	}

	@Override
	public List<ProcessModel> convertProcessClass(Class<? extends ProcessCall> processClass) {
		List<ProcessModel> result = new ArrayList<>();
		FlyProcess anno = processClass.getAnnotation(FlyProcess.class);
		if (anno != null) {
			ProcessModel process = buildProcess(anno);
			process.setApiName(processClass.getName());
			process.setProcessID(UUIDUtil.newUUID());
			process.setParas(buildProcessParas(process, processClass));
			FlyEntityUtils.updateFlyEntityForSystem(process);
			result.add(process);
		}
		return result;
	}

	private Map<String, FProcessPara> buildProcessParas(ProcessModel process,
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
		FProcessPara result = new FProcessPara();
		result.setProcessParaID(UUIDUtil.newUUID());
		result.setApiName(field.getName());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		FElement element = FlyMemoryDataModel.getInstance().getElements().get(result.getApiName());
		if (element != null) {
			result.setElement(element);
			result.setElementID(element.getElementID());
			result.setName(element.getName());
			result.setDescription(element.getDescription());
			result.setHelp(element.getHelp());
			result.setEntityType(element.getEntityType());
			result.setDataType(element.getDataType());
			result.setColumnName(element.getColumnName());
			result.setFieldLength(element.getFieldLength());
			result.setReferenceID(element.getReferenceID());
		}
		return result;
	}

	private ProcessModel buildProcess(FlyProcess anno) {
		ProcessModel result = new ProcessModel();
		return result;
	}

}
