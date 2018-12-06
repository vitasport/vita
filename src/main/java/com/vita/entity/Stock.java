package com.vita.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Stock {
    private Integer id;

    private Integer groundId;

    private String groundName;

    private Date date;

    private Date startTime;

    private Date endTime;

    private Integer price;

    private String status;

    private Integer version;

}