package com.hamitmizrak.dao;

import com.hamitmizrak.database.DatabaseConnection;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoConnection<T> {

    // CRUD
    // CREATE
    public T create(T t);

    // LIST
    public ArrayList<T> list();

    // UPDATE
    public T update(T t);

    // DELETE
    public T delete(T t);

    //
   default Connection getInterfaceConection(){
        return DatabaseConnection.getInstance().getConnection();
    }

} //end interface
