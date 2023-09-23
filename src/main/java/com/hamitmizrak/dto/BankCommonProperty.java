package com.hamitmizrak.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
abstract public class BankCommonProperty  implements Serializable {
    public static final Long serialVersionUID=1L;

    // Global Variable
    protected Long id;
    protected String name;
    protected String email;
    protected String password;

    @Builder.Default // Lombok
    protected Date createdDate=new Date(System.currentTimeMillis());

    // Gövdesiz Method
    abstract public String nowDate();
}//end class
