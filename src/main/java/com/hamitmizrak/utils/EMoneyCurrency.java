package com.hamitmizrak.utils;

import lombok.Getter;

public enum EMoneyCurrency {

    TR(1,"tr"),EN(2,"en"),GE(3,"ge");


    private final Integer number;
    private final String currency;

    // NOT: final yazarsak;
    // parametreli constructor zorlar
    // SETTER metotudunu yazdırmaz
    EMoneyCurrency(Integer number, String currency) {
        this.number = number;
        this.currency = currency;
    }

    // GETTER
    public Integer getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }
}
