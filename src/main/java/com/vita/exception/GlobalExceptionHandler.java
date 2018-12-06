package com.vita.exception;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.alibaba.fastjson.JSONObject;
import com.vita.enums.CodeEnum;
import com.vita.model.JSONResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
	
	/**
	 * 系统异常处理，比如：404,500
	 * 
	 * @param req
	 * @param resp
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public JSONResult<String> defaultErrorHandler(HttpServletRequest req, Exception exe) {
		exe.printStackTrace();
		Map<String, String[]> map = req.getParameterMap();
		log.info("出错时请求参数:[{}]", JSONObject.toJSON(map));
		JSONResult<String> result = new JSONResult<String>();
		try {
			throw exe;
		} catch (HttpRequestMethodNotSupportedException e) {
			result.setCode(CodeEnum.C505.getCode());
			result.setDesc(e.getMessage());
		} catch (NoHandlerFoundException e) {
			result.setCode(CodeEnum.C400.getCode());
			result.setDesc(e.getMessage());
		} catch (ServerException e) {
			result.setCode(e.getCode());
			result.setDesc(e.getDesc());
		} catch (Exception e) {
			result.setCode(CodeEnum.C500.getCode());
			result.setDesc("系统繁忙");
		}
		log.info("出错返回结果:[{}]", result.toString());
		return result;
	}
}