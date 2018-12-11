package com.vita.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
public class OrderGround {
    private Integer id;

    private Integer orderId;

    private String orderNo;

    private Integer productId;

    private String productName;

    private String groundId;

    private String groundName;

    private String orderStatus;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate orderDate;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime endTime;

    private List<Stock> stocks;
}