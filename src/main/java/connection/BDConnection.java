
package connection;

import java.sql.Connection;
import java.sql.DriverManager;



public class BDConnection {
    
    Connection connection;
    
    static String bd= "solicitudes";
    static String port ="3306";
    static String login="rootmintic" ;
    static String password ="admin1234";
    

    public BDConnection() {
        try { Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://db4free.net:"+this.port+"/"+this.bd;
        connection=DriverManager.getConnection(url,this.login,this.password);
            System.out.println("Conexion establecida");
            
        } catch (Exception ex) {
            System.out.println("Error en conexion");
        }
    }
    
    public Connection getConnection(){
        return connection;
        }
    public void desconectar (){
    connection =null;
    }
    
    
}
