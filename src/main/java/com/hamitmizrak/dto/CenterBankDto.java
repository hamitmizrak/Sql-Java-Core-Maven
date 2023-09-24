package com.hamitmizrak.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Getter
@Setter
@Builder
public class CenterBankDto extends CommonProperty implements Serializable {
    public static final Long serialVersionUID=1L;

    // Global Variable
    private String centerBankName;
    private String centerCityName;
    private String centerCityLogo;
    private boolean bankCheck=false;

    // parametresiz constructor
    public CenterBankDto() {
        this.centerBankName="Banka adını girmediniz";
        this.centerCityName="Banka şehir adını girmediniz";
        this.centerCityLogo="Banka logosunu girmediniz";
        this.bankCheck=false;
    }

    public CenterBankDto(String centerBankName, String centerCityName, String centerCityLogo, boolean bankCheck) {
        this.centerBankName = centerBankName;
        this.centerCityName = centerCityName;
        this.centerCityLogo = centerCityLogo;
        this.bankCheck = bankCheck;
    }


    @Override
    public String toString() {
        return "CenterBankDto{" +
                "centerBankName='" + centerBankName + '\'' +
                ", centerCityName='" + centerCityName + '\'' +
                ", centerCityLogo='" + centerCityLogo + '\'' +
                ", bankCheck=" + bankCheck +
                ", id=" + id +
                ", createdDate=" + createdDate +
                "} " + super.toString();
    }
}
