package com.hamitmizrak.dao;

import com.hamitmizrak.database.DatabaseConnection;

import java.sql.Connection;
import java.util.ArrayList;

public  interface IDaoConnection<T> {

    // CRUD
    // CREATE
    public T create(T t);

    // LIST
    public ArrayList<T> list();

    public T findById(Long id);

    // UPDATE
    public T update(Long id,T t);

    // DELETE
    public T delete(Long id);

    //
   default Connection getInterfaceConnection(){
        return DatabaseConnection.getInstance().getConnection();
    }

} //end interface
