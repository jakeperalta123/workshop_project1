package com.example.springwebservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tcnud")
@IdClass(tcnudId.class)
public class tcnud {
    @Id
    @Column
    private String tradeDate;

    @Id
    @Column
    private String branchNo;

    @Id
    @Column
    private String custSeq;

    @Id
    @Column
    private String docSeq;

    @Column
    private String stock;

    @Column
    private double price;

    @Column
    private double qty;

    @Column
    private double remainQty;

    @Column
    private double fee;

    @Column
    private double cost;

    @Column
    private String modDate;

    @Column
    private String modTime;

    @Column
    private String modUser;
}
