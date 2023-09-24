package com.hamitmizrak.database;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// LOMBOK
@Getter
@Setter
@ToString
public class DatabaseInformation {

    // for database connection
    private String user;
    private String password;
    private String url;

    // for database Driver
    private String forNameData;

    // Parametresiz constructor
    public DatabaseInformation() {
        // MYSQL
        this.url=DatabaseStaticInformation.MYSQL_URL;
        this.user=DatabaseStaticInformation.MYSQL_USER;
        this.password=DatabaseStaticInformation.MYSQL_PASSWORD;
        this.forNameData=DatabaseStaticInformation.MYSQL_FOR_NAME_DATA;

        // POSTGRESQL

        // H2DB
    }

    // parametreli constructor
    public DatabaseInformation(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

}// end class
