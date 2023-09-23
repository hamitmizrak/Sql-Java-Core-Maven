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


    // toString
    @Override
    public String toString() {
        return "BankCommonProperty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    // Gövdesiz Method
    abstract public String nowDate();
}//end class
