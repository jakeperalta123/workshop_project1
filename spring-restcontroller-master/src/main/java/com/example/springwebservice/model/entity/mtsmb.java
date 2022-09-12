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
@Table(name = "mstmb")
public class mtsmb {
    @Id
    @Column
    private String stock;

    @Lob
    @Column
    private String stockName;

    @Column
    private String marketType;

    @Column
    private double curPrice;

    @Column
    private double RefPrice;

    @Column
    private String currency;

    @Column
    private String modDate;

    @Column
    private String modTime;

    @Column
    private String   modUser;
}
