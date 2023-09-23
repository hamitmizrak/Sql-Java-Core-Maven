package com.hamitmizrak.dto;


import lombok.*;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Getter
@Setter
@ToString
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

}//end class



