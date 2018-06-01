package org.myfly.platform.core.spring;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController 异常系统级处理
 * 
 * @author xiangwanhong
 *
 */
@ControllerAdvice(annotations = RestController.class)
public class RestControllerExceptionHandlerAdvice {
	@ExceptionHandler
	public ResponseEntity<RestError> exceptionHandler(Exception e) {
		e.printStackTrace();
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		RestError error = new RestError();
		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		error.setMessage(e.getMessage());
		error.setTrace(sw.toString());
		return new ResponseEntity<RestError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
