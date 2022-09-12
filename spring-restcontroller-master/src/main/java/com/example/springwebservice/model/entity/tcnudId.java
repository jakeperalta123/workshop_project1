package com.example.springwebservice.model.entity;

import java.io.Serializable;

public class tcnudId implements Serializable {
    private String tradeDate;
    private String branchNo;
    private String custSeq;
    private String docSeq;

    public tcnudId(String tradeDate, String branchNo, String custSeq, String docSeq) {
        this.tradeDate = tradeDate;
        this.branchNo = branchNo;
        this.custSeq = custSeq;
        this.docSeq = docSeq;
    }
}
