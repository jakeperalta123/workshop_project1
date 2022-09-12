package com.example.springwebservice.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddBalanceResponse {
    private String tradeDate;
    private String docSeq;
    private String stock;
    private String stockName;
    private double buyPrice;
    private double nowPrice;
    private double qty;
    private double remainQty;
    private double fee;
    private double cost;
    private double marketValue;
    private double unrealProfit;
    private String responseCode;
    private String message;
}
