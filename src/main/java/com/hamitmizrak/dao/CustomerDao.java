package com.hamitmizrak.dao;

import com.hamitmizrak.dto.CustomerDto;

import java.util.ArrayList;

public class CustomerDao implements IDaoConnection<CustomerDto> {

    // CUSTOMER CREATE
    @Override
    public CustomerDto create(CustomerDto customerDto) {
        return null;
    }

    // CUSTOMER LIST
    @Override
    public ArrayList<CustomerDto> list() {
        return null;
    }

    @Override
    public CustomerDto findById(Long id) {
        return null;
    }

    // CUSTOMER UPDATE
    @Override
    public CustomerDto update(CustomerDto customerDto) {
        return null;
    }

   // CUSTOMER DELETE
    @Override
    public CustomerDto delete(CustomerDto customerDto) {
        return null;
    }
} //end class
