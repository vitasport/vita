package com.vita.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
public class Stock {
    private Integer id;

    private Integer groundId;

    private String groundName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime endTime;

    private Integer price;

    private String status;

    private Integer version;

    private Integer orderId;

    private String sportKey;

    private String operId;

    private String operName;

}