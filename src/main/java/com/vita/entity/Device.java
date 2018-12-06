package com.vita.entity;

import lombok.Data;

@Data
public class Device {
    private Integer id;

    private String deviceNo;

    private String name;

    private String description;

    private Integer masterId;

    private Integer masterIndex;

}