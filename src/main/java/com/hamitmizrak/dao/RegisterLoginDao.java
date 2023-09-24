package com.hamitmizrak.dao;

import com.hamitmizrak.database.DatabaseConnection;
import com.hamitmizrak.dto.RegisterDto;
import com.hamitmizrak.login.ILoginProcess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterLoginDao implements ILoginProcess {


    @Override
    public RegisterDto isLogin(String email, String password) {
        RegisterDto registerDto = null;
        try (Connection connection = DatabaseConnection.getInstance().getConnection()) {
            // select * from `atm`.`atm_register` where email_address="hamitmizrak2@gmail.com" and password="root422" ;
            // sql query
            //String sql = "select * from `atm`.`atm_register` where email_address="+email+" and password"+password;
            //"hamitmizrak2@gmail.com","root42223"
            String sql = "select * from `atm`.`atm_register` where email_address=\"" + email + "\" and password=\"" + password + "\" ";
            // PreparedStatement Create
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // Sorgu: executeQuery
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                registerDto = new RegisterDto();
                registerDto.setId(resultSet.getLong("id"));
                registerDto.setName(resultSet.getString("name"));
                registerDto.setSurname(resultSet.getString("surname"));
                registerDto.setEmailAddress(resultSet.getString("email_address"));
                registerDto.setPassword(resultSet.getString("password"));
                registerDto.setTelephoneNumber(resultSet.getString("telephone_number"));
                registerDto.setRemainingNumber(resultSet.getString("remaining_number"));
                registerDto.setIsPassive(resultSet.getString("is_passive"));
            }
            System.out.println(registerDto);
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
        // eğer kullanıcı yoksa register sayfasına yönlendir

        if (registerDto == null) {
            register();
        }
        return registerDto;
    }

    @Override
    public void register() {
        System.out.println("Kayıt sayfasına hoş geldiniz");
    }

    @Override
    public Double addMoney() {
        return null;
    }

    @Override
    public void showMoney() {

    }

    @Override
    public void reduceMoney() {

    }

    @Override
    public void sentEftMoney() {

    }

    // HAVALE
    @Override
    public void sentTransferMoney() {

    }

    //Mail Gönder
    @Override
    public void smailSend() {

    }

    // Logout
    @Override
    public void logout() {
        System.out.println("Çıkış yapılıyor.");
        System.exit(0);
    }

    public static void main(String[] args) {
        RegisterLoginDao registerLoginDao = new RegisterLoginDao();
        registerLoginDao.isLogin("hamitmizrak2@gmail.com", "root42223");
    }
}
