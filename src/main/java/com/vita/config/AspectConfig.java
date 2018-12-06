package com.vita.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.BindingResult;

import com.alibaba.fastjson.JSONObject;
import com.vita.enums.CodeEnum;
import com.vita.exception.ServerException;

import lombok.extern.slf4j.Slf4j;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 *
 * @Description : 
 * ---------------------------------
 * @Author : tawift
 * @Date : Create in 2018年8月7日 下午1:48:54
 */
@Slf4j
@Aspect
@Configuration
public class AspectConfig {

	@Pointcut("execution(public * com.vita.controller.*.*(..))")
	public void param() {
	}

	@Before("param()")
	public void logParam(JoinPoint point) {
		log.info("接收到请求参数:[{}]", point.getArgs());
	}

	@AfterReturning(returning = "result", value = "param()")
	public void logResult(JoinPoint point, Object result) {
		log.info("返回结果:[{}]", JSONObject.toJSON(result));
	}

	@Around(value = "param()")
	public Object requestBadParameter(ProceedingJoinPoint pjp) throws Throwable {
		Object[] args = pjp.getArgs();
		if (args.length == 0)
			return pjp.proceed();
		for (Object object : args) {
			if (object instanceof BindingResult) {
				// 有校验
				BindingResult result = (BindingResult) object;
				if (result.hasErrors()) {
					throw new ServerException(CodeEnum.C400.getCode(), result.getFieldErrors().get(0).getField() + " "
							+ result.getFieldErrors().get(0).getDefaultMessage());
				}
			}
		}
		return pjp.proceed();
	}
}
