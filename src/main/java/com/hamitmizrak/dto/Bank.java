package com.hamitmizrak.dto;

import lombok.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bank  extends BankCommonProperty implements Serializable {
    public static final Long serialVersionUID=1L;

    // Global Variable
    private String countryName;

    // parametreli constructor
    public Bank(Long id, String name, String email, String password, Date createdDate, String countryName) {
        super(id, name, email, password, createdDate);
        this.countryName = countryName;
    }

    // ToString


    @Override
    public String toString() {
        return "Bank{" +
                "countryName='" + countryName + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                "} " + super.toString();
    }

    // Gövdesiz Method
    @Override
    public String nowDate() {
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        Date date=new Date();
        String format=simpleDateFormat.format(date);
        //System.out.println(new Date(System.currentTimeMillis()));
        System.out.println(format);
        return format;
    }
}//end class



