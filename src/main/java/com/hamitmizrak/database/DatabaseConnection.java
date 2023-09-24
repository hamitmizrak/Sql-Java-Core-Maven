package com.hamitmizrak.database;



import lombok.Getter;
import java.sql.Connection;
import java.sql.DriverManager;

// LOMBOK
public class DatabaseConnection extends DatabaseInformation{

    // Database Connection  java.sql.Connection
    private Connection connection;

    // Database Information
    private String user=this.getUser();
    private String password=this.getPassword();
    private String url=this.getUrl();

    // Singleton Design Pattern
    // Sadece 1 tane instance oluşturup onun üzerinden çalışmak
    // eğer instance yoksa oluştur, varsa onu kullanan

    // singleton
    @Getter
    private  static DatabaseConnection instance ;

    // Singleton Parametresiz Constructor
    public DatabaseConnection()  {
        try {
            Class.forName(this.getForNameData());
            //System.out.println("Driver başarıyla Yüklendi");
            connection= DriverManager.getConnection(url,user,password);
            //System.out.println("Database bağlanıldı başarıyla Yüklendi");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Singleton Instance
    public static DatabaseConnection getInstance(){
        try{
            if(instance==null || instance.connection.isClosed()){
                instance=new DatabaseConnection();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return instance;
    }

    //GETTER SETTER


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    // PSVM
    public static void main(String[] args) {
        DatabaseConnection databaseConnection=new DatabaseConnection();
    }

}// end class
