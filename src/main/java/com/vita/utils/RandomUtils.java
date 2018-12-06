package com.vita.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

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
 * @Date : Create in 2018年3月14日 上午9:26:01
 */
public class RandomUtils {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssS");
	
	
	
	/**
	 * 
	 * TODO
	 * tawift
	 * 2018年11月2日 下午3:34:00
	 * @return
	 * String
	 */
	public static synchronized String randomOrderNo() {
		return sdf.format(new Date())+randomTicketNo();
	}
	
	public static synchronized String randomTradeNo() {
		return sdf.format(new Date())+randomStrByLength(8);
	}

	/**
	 * 
	 * tawift
	 * 2018年6月5日 下午5:41:34
	 * @return   88888888
	 * String
	 */
	public static String randomTicketNo() {
		return RandomStringUtils.randomNumeric(6);
	}
	
	public static String randomToken() {
		return RandomStringUtils.randomNumeric(8);
	}
	
	public static String randomStrByLength(int length) {
		return RandomStringUtils.randomNumeric(length);
	}

	/**
	 * 随机1-5积分
	 * 1积分50%，2积分20%，3积分15%，4积分10%。5积分5%
	 * @param days 第几天
	 */
    public static int randomPoints(int days) {
		Random rd = new Random();
		int i = rd.nextInt(20);
		if(i == 19)
			return 5;
		if(i % 10 == 0)
			return 4;
		if(i < 3)
			return 3;
		if(i % 5 == 0)
			return 2;
		return 1;
	}

}
