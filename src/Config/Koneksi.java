package Config;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Koneksi {

    private String database = "_uas_";
    private String url = "jdbc:mysql://localhost/" + database;
    private String username = "root";
    private String password = "";
    private Connection kon;
    private Statement stm;
    
    public Koneksi(){
       try{ 
        Class.forName("com.mysql.jdbc.Driver");
        kon = DriverManager.getConnection(url, username, password);
        stm = kon.createStatement();
        }catch (Exception e) {
           System.err.println("Koneksi Gagal" + e.getMessage());
        }
    
    }
    public Connection getKon(){
        return kon;
    }
    public Statement getStm(){
        return stm;
    }
}