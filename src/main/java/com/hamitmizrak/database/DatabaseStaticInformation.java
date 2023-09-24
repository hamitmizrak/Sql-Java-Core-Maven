package com.hamitmizrak.database;

public class DatabaseStaticInformation {

    // MYSQL
    public static final String MYSQL_USER="root";
    public static final String MYSQL_PASSWORD="root";
    public static final String MYSQL_URL="jdbc:mysql://localhost:3306/atm?createDatabaseIfNotExist=true&autoReconnect=true&allowPublicKeyRetrieval=true&useSSL=false";
    //public static final String MYSQL_FOR_NAME_DATA="com.mysql.cj.jdbc.Driver'";
    public static final String MYSQL_FOR_NAME_DATA="com.mysql.jdbc.Driver";


    // POSTGRESQL
    public static final String POSTGRESQL_URL="jdbc:postgresql//localhost:5432/atm";
    public static final String POSTGRESQL_FOR_NAME_DATA="org.postgresql.Driver";

    //H2DB
    public static final String H2DB_URL="jdbc:h2:file./memory_persist/atm";
    public static final String H2DB_FOR_NAME_DATA="org.h2.Driver";

}
