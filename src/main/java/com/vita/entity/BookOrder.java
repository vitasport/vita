package com.vita.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BookOrder {
    private Integer id;

    private String orderNo;

    private Integer orderAmt;

    private Integer count;

    private Date validityTime;

    private Integer duration;

    private Date orderDate;

    private Integer income;

    private Integer mBath;

    private Integer wBath;

    private Integer mLocker;

    private Integer wLocker;

    private Integer userId;

    private String nickName;

    private String phone;

    private String authPhone;

    private Date createDate;

    private Date createTime;

    private String status;

    private String payStatus;

    private Date payFinishTime;

    private String payChannel;

    private String stadiumId;

    private Integer productId;

    private String productName;

    private String source;

    private String type;

    private String orderInfo;

    private Integer incomeNum;

    private Integer refundAmt;

    private String resundStatus;

    private String outTradeNo;

    private String outPayId;

    private String failDesc;

    private Integer version;

    private String shortUrl;

}