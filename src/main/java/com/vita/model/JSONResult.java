package com.vita.model;

import com.vita.enums.CodeEnum;

import lombok.Data;

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
 * @Date : Create in 2018年8月6日 上午10:35:21
 */
@Data
public class JSONResult<T> {
	
	private Integer code;
	
	private String desc;
	
	private T data;
	
	public JSONResult() {
		this.code = CodeEnum.C200.getCode();
		this.desc = CodeEnum.C200.getDesc();
	}
	
	public JSONResult(Integer code, String desc){
		this.code = code;
		this.desc = desc;
	}
	
	public JSONResult(CodeEnum ce){
		this.code = ce.getCode();
		this.desc = ce.getDesc();
	}
	public JSONResult(CodeEnum ce,String msg){
		this.code = ce.getCode();
		this.desc = ce.getDesc() + "," + msg;
	}
	
	public JSONResult(T data){
		this.code = CodeEnum.C200.getCode();
		this.desc = CodeEnum.C200.getDesc();
		this.data = data;
	}

}
