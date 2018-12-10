package model;

import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private String user ="gera";
    private String password ="karla1234";
    private String hostname ="localhost";
    private String port ="3306";
    private String database ="finperi";
    private String classname ="com.mysql.jdbc.Driver";
    private String url ="jdbc:mysql://"+hostname+":"+port+"/"+database+"?noAccesToProcedureBodies=true";
    private Connection con;

    public conexion(){
        try {
            Class.forName(classname);
            con= DriverManager.getConnection(url, user, password);
        }catch (ClassNotFoundException e){
            System.err.println(e.getMessage());
        }catch (SQLException esq1){
            System.err.println(esq1.getMessage());
        }
    }
    public Connection getConection() {return con;}
}
