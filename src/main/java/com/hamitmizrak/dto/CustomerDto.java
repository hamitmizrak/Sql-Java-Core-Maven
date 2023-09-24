package com.hamitmizrak.dto;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@Builder
public class CustomerDto extends CommonProperty implements Serializable {
    public static final Long serialVersionUID=1L;

    // Global Variable
    private String surname;
    private String username;


    // parametreli constructor
    public CustomerDto(String surname, String username) {
        this.surname = surname;
        this.username = username;
    }

    // ToString
    @Override
    public String toString() {
        return "Customer{" +
                "surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                ", createdDate=" + createdDate +
                "} " + super.toString();
    }
}//end class
