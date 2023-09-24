package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoConnection;
import com.hamitmizrak.dao.RegisterDao;
import com.hamitmizrak.dto.RegisterDto;

import java.util.ArrayList;

public class RegisterController  implements IDaoConnection<RegisterDto> {

    // Field
    private RegisterDao registerDao;

    // Parametresiz Constructor
    public RegisterController() {
        registerDao=new RegisterDao();
    }
    //////////////////////////////////////////
    // EMAIL FILE READER WRITER

    //////////////////////////////////////////
    // REGISTER CREATE
    @Override
    public RegisterDto create(RegisterDto registerDto) {
        return registerDao.create(registerDto);
    }

    // REGISTER LIST
    @Override
    public ArrayList<RegisterDto> list() {
        return registerDao.list();
    }

    // REGISTER FIND BY ID
    @Override
    public RegisterDto findById(Long id) {
        return registerDao.findById(id);
    }

    // REGISTER UPDATE
    @Override
    public RegisterDto update(RegisterDto registerDto) {
        return registerDao.update(registerDto);
    }

    // REGISTER DELETE
    @Override
    public RegisterDto delete(RegisterDto registerDto) {
        return registerDao.delete(registerDto);
    }
}
