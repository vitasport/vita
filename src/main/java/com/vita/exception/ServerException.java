package com.vita.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
 * @Date : Create in 2018年8月6日 下午4:25:59
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ServerException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8810750825920992065L;

	private Integer code;
	
	private String desc;

	public ServerException(Integer code,String desc) {
		this.code = code;
		this.desc = desc;
	}
	
}
