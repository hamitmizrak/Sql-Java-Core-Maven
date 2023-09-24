package com.hamitmizrak.dto;

import lombok.*;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
public class RegisterDto  extends CommonProperty implements Serializable {
    public static final Long serialVersionUID=1L;

    //Global Variable
    private String name;
    private String surname;
    private String emailAddress;
    private String password;
    private String telephoneNumber;
    private String remainingNumber; // Login girişinde kalan sayı
    private String isPassive="0"; // Kullanıcı aktif mi: 0:ise kullanıcı aktif

    // Parametreli constructor
    public RegisterDto(String name, String surname, String emailAddress, String password, String telephoneNumber, String remainingNumber, String isPassive) {
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.remainingNumber = remainingNumber;
        this.isPassive = isPassive;
    }

    // ToString
    @Override
    public String toString() {
        return "RegisterDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", remainingNumber='" + remainingNumber + '\'' +
                ", isPassive=" + isPassive +
                ", id=" + id +
                ", createdDate=" + createdDate +
                "} " + super.toString();
    }

    // Test Main
    public static void main(String[] args) {
        RegisterDto registerDto=RegisterDto
                .builder()
                .name("HamitM")
                .build();
        System.out.println(registerDto.getName());
    }
}
