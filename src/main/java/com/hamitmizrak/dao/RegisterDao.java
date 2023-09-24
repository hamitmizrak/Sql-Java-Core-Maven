package com.hamitmizrak.dao;

import com.hamitmizrak.dto.RegisterDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisterDao implements IDaoConnection<RegisterDto> {

    // TRUNCATE `atm`.`atm_register`;
    // drop database `atm` ;

    // REGISTER CREATE
    // transaction: create, delete, update
    @Override
    public RegisterDto create(RegisterDto registerDto) {
        if (registerDto != null) {
            try (Connection connection = getInterfaceConnection()) {
                // Transaction  açmak
                connection.setAutoCommit(false);
                // insert into `atm`.`atm_register` (name,surname,email_addres,password,telephone_number) values ("Hamit","Mızrak","hamitmizrak@gmail.com","root44","+901112223344");
                // sql query
                String sql = "insert into `atm`.`atm_register` (name,surname,email_addres,password,telephone_number) values (?,?,?,?,?);\n";
                // PreparedStatement Create
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, registerDto.getName());
                preparedStatement.setString(2, registerDto.getSurname());
                preparedStatement.setString(3, registerDto.getEmailAddress());
                preparedStatement.setString(4, registerDto.getPassword());
                preparedStatement.setString(5, registerDto.getTelephoneNumber());
                // Effected
                int rowEffected = preparedStatement.executeUpdate();
                if (rowEffected > 0) {
                    System.out.println(RegisterDto.class + " Ekleme Tamam");
                    // Transaction  commitleme
                    connection.commit();
                } else {
                    System.err.println(RegisterDto.class + " Başarısız Ekleme");
                    // Transaction  işlem iptali
                    connection.rollback();
                }
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
            return registerDto;
        }
        return null;
    }

    // REGISTER LIST
    @Override
    public ArrayList<RegisterDto> list() {
        ArrayList<RegisterDto> registerList = new ArrayList<>();
        RegisterDto registerDto;
        try (Connection connection = getInterfaceConnection()) {
            // select * from `atm`.`atm_register` ;
            // sql query
            String sql = "select * from `atm`.`atm_register`;";
            // PreparedStatement Create
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // Sorgu: executeQuery
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                registerDto=new RegisterDto();
                registerDto.setId(resultSet.getLong("id"));
                registerDto.setName(resultSet.getString("name"));
                registerDto.setSurname(resultSet.getString("surname"));
                registerDto.setEmailAddress(resultSet.getString("email_addres"));
                registerDto.setPassword(resultSet.getString("password"));
                registerDto.setTelephoneNumber(resultSet.getString("telephone_number"));
                registerList.add(registerDto);
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
        return registerList;
    }

    // FIND BY ID
    @Override
    public RegisterDto findById(Long id) {
        RegisterDto registerDto=null;
        try (Connection connection = getInterfaceConnection()) {
            // select * from `atm`.`atm_register where id=1` ;
            // sql query
            String sql = "select * from `atm`.`atm_register where id=`"+id;
            // PreparedStatement Create
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // Sorgu: executeQuery
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                registerDto=new RegisterDto();
                registerDto.setId(resultSet.getLong("id"));
                registerDto.setName(resultSet.getString("name"));
                registerDto.setSurname(resultSet.getString("surname"));
                registerDto.setEmailAddress(resultSet.getString("email_addres"));
                registerDto.setPassword(resultSet.getString("password"));
                registerDto.setTelephoneNumber(resultSet.getString("telephone_number"));
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
        return registerDto;
    }

    // REGISTER UPDATE
    @Override
    public RegisterDto update(RegisterDto registerDto) {
        if (registerDto != null) {
            try (Connection connection = getInterfaceConnection()) {
                // Transaction  açmak
                connection.setAutoCommit(false);
                // update `atm`.`atm_register` set  name="Adı44", surname="soyadı44",email_address="email44@gmail.com",password="şifre44",telephone_number="telefon44" where id=1;
                // sql query
                String sql = "update `atm`.`atm_register` set  name=?, surname=?,email_address=?,password=?,telephone_number=? where id=?;";
                // PreparedStatement Create
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, registerDto.getName());
                preparedStatement.setString(2, registerDto.getSurname());
                preparedStatement.setString(3, registerDto.getEmailAddress());
                preparedStatement.setString(4, registerDto.getPassword());
                preparedStatement.setString(5, registerDto.getTelephoneNumber());
                preparedStatement.setLong(6, registerDto.getId());
                // Effected
                int rowEffected = preparedStatement.executeUpdate();
                if (rowEffected > 0) {
                    System.out.println(RegisterDto.class + " Güncelleme Tamam");
                    // Transaction  commitleme
                    connection.commit();
                } else {
                    System.err.println(RegisterDto.class + " Başarısız Güncelleme");
                    // Transaction  işlem iptali
                    connection.rollback();
                }
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
            return registerDto;
        }
        return null;
    }

    // REGISTER DELETE
    @Override
    public RegisterDto delete(RegisterDto registerDto) {
        if (registerDto != null) {
            try (Connection connection = getInterfaceConnection()) {
                // Transaction  açmak
                connection.setAutoCommit(false);
                // delete from `atm`.`atm_register` where id="1"
                // sql query
                String sql = "delete from `atm`.`atm_register` where id=?";
                // PreparedStatement Create
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, registerDto.getId());
                // Effected
                int rowEffected = preparedStatement.executeUpdate();
                if (rowEffected > 0) {
                    System.out.println(RegisterDto.class + " Silme Tamam");
                    // Transaction  commitleme
                    connection.commit();
                } else {
                    System.err.println(RegisterDto.class + " Başarısız Silme");
                    // Transaction işlem iptali
                    connection.rollback();
                }
            } catch (SQLException sql) {
                sql.printStackTrace();
            }
            return registerDto;
        }
        return null;
    }
} //end class
