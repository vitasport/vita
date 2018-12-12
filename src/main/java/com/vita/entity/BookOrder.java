package com.vita.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Data
public class BookOrder {
    private Integer id;

    private String orderNo;

    private Integer orderAmt;

    private Integer count;

    private Date validityTime;

    private Integer duration;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate orderDate;

    private Integer income;

    private Integer mBath;

    private Integer wBath;

    private Integer mLocker;

    private Integer wLocker;

    private Integer userId;

    private String nickName;

    private String phone;

    private String authPhone;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime createTime;

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

    private String refundStatus;

    private String outTradeNo;

    private String outPayId;

    private String failDesc;

    private Integer version;

    private String shortUrl;

}