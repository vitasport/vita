package com.vita.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
public class Stock {
    private Integer id;

    private Integer groundId;

    private String groundName;

    private LocalDate date;

    private LocalTime startTime;

    private LocalTime endTime;

    private Integer price;

    private String status;

    private Integer version;

}