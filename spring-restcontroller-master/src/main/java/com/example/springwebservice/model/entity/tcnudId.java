package com.example.springwebservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
public class tcnudId implements Serializable {
    private String tradeDate;
    private String branchNo;
    private String custSeq;
    private String docSeq;

}
