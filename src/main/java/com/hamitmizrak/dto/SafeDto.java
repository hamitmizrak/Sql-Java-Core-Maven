package com.hamitmizrak.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Builder
public class SafeDto extends CommonProperty implements Serializable {

    // Field Varaible
    private String moneyType; // Para Türü, kağıt para, bozuk para
    private String moneyCurrency; // Para birimi, tr,en,ge
    private Double moneyAmount; // Para miktarı

    // parametresiz constructor
    public SafeDto() {
        this.moneyAmount=1000.0;
    }

    // parametreli constructor
    public SafeDto( String moneyType, String moneyCurrency, Double moneyAmount) {
        this.moneyType = moneyType;
        this.moneyCurrency = moneyCurrency;
        this.moneyAmount = moneyAmount;
    }

    // ToString
    @Override
    public String toString() {
        return "SafeDto{" +
                "moneyType='" + moneyType + '\'' +
                ", moneyCurrency='" + moneyCurrency + '\'' +
                ", moneyAmount=" + moneyAmount +
                ", id=" + id +
                ", createdDate=" + createdDate +
                "} " + super.toString();
    }
}

