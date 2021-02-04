package jdbc;

import java.sql.*;

public class JdbcConexion {

    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/dataBase","root","pass");
            Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("SELECT * FROM agenda ORDER BY id ASC");
            while(resultado.next()){
                System.out.println("\t"+resultado.getString("campo1")+"\t"+resultado.getString("campo2"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}