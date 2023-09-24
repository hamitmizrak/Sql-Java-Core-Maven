package com.hamitmizrak.utils;

// Enum: Sıralama, Sayılandırma, type safe

public enum EMoneyCurrency {

    // para birimi
    TR(1, "tr"), EN(2, "en"), GE(3, "ge");

    // Global variable final
    // NOT: final yazarsak;
    // parametreli constructor zorlar
    // SETTER metotudunu yazdırmaz
    private final Integer number;
    private final String currency;

    // Parametreli constructor
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
