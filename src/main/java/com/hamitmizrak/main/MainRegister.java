package com.hamitmizrak.main;

import com.hamitmizrak.controller.RegisterController;
import com.hamitmizrak.dto.RegisterDto;

public class MainRegister {
    public static void main(String[] args) {
        RegisterController registerController = new RegisterController();
        RegisterDto registerDto = RegisterDto
                .builder()
                .name("adı55")
                .surname("soyadı55")
                .telephoneNumber("telefon55")
                .password("password55")
                .isPassive("1")
                .emailAddress("emailAddress5")
                .remainingNumber("5")
                .build();

        //CREATE
        //registerController.create(registerDto);

        //FIND
        //RegisterDto registerDtoFind = registerController.findById(5L);
        //System.out.println(registerDtoFind);


        //LIST
        //registerController.list().forEach((temp)->{System.out.println(temp);});

        // UPDATE
        //registerController.update(1L,registerDto);

        //DELETE
        //registerController.delete(1L);

    }
}
