package com.vita.enums;

import lombok.Getter;

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
 * @Date : Create in 2018年8月6日 上午10:38:29
 */
@Getter
public enum CodeEnum {
	
	C200(200,"SUCCESS"),
	C201(201,"失败"),
	C202(202,"消费失败"),
	C203(203,"查询失败"),
	C204(204,"签到失败"),
	C400(400,"请求参数错误"),
	C404(404,"资源路径不存在"),
	C405(405,"请求后端服务失败"),
	C406(406,"提现失败，余额不足"),
	C500(500,"系统错误"),
	C505(505,"请求方式不支持");
	
	private Integer code;
	
	private String desc;
	
	CodeEnum(Integer code,String desc){
		this.code = code;
		this.desc = desc;
	}

}
