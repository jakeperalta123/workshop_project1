package com.example.springwebservice.model.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

// 使用 Lombok 加入 Getter, Setter, Constructor
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hcmio")
@IdClass(UserId.class)
public class User {
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
    private String BsType;

    @Column
    private double price;

    @Column
    private double qty;

    @Column
    private double amt;

    @Column
    private double fee;

    @Column
    private double tax;

    @Column
    private double stinTax;

    @Column
    private double netAmt;

    @Column
    private String modDate;

    @Column
    private String modTime;

    @Column
    private String modUser;

}

