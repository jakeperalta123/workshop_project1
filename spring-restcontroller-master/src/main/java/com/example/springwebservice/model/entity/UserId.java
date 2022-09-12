package com.example.springwebservice.model.entity;

import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
public class UserId implements Serializable {
    private String tradeDate;
    private String branchNo;
    private String custSeq;
    private String docSeq;

    public UserId(String tradeDate, String branchNo, String custSeq, String docSeq) {
        this.tradeDate = tradeDate;
        this.branchNo = branchNo;
        this.custSeq = custSeq;
        this.docSeq = docSeq;
    }
}
