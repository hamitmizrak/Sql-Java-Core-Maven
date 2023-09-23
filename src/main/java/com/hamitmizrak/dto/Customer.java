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
public class Customer extends BankCommonProperty implements Serializable {
    public static final Long serialVersionUID=1L;

    // Global Variable
    private String surname;
    private String username;
    private Double money;

    // parametreli constructor
    public Customer(Long id, String name, String email, String password, Date createdDate, String surname, String username, Double money) {
        super(id, name, email, password, createdDate);
        this.surname = surname;
        this.username = username;
        this.money = money;
    }

    // Gövdesiz Method
    @Override
    public void nowDate() {
        System.out.println(new Date(System.currentTimeMillis()));
    }
}//end class
