
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectate {
    Connection conn = null;
    /*String login="DANIEL\\Daniel";
    static String password = "";
    static String url="jdbc:odbc:netbean";
    Connection conn = null;
    String URL = "jdbc:sqlserver://localhost:1433;databaseName=CASA_SUBASTAS;integratedSecurity=true;";
    String USER = "DANIEL\\Daniel";
    String PASS = "";
    
    
    //String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    public conectate() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            //conn = DriverManager.getConnection(url, login, password);
            if(conn != null){
                JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
            }
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null,conn);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }*/
    
    public Connection Conectar(){
        
        try {          
            String dbURL = "jdbc:sqlserver://localhost;integratedSecurity=true;database=CASA_SUBASTAS"; 
            // User y password requerido si fuera autenticación de base de datos
                String user = "DANIEL\\Daniel";
                String pass = "";
                //RL = "jdbc:sqlserver://localhost;databaseName=Repuestos;integratedSecurity=true;";
                conn = DriverManager.getConnection(dbURL, user, pass);
            // Establece conexión con servidor de base de datos.
            // En caso de error conexión es nula.
            conn = DriverManager.getConnection(dbURL); 
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch(Exception e){
        // En caso de error se imprime la pila de llamadas.
            e.printStackTrace();
        }
        return conn;
  }
    
    public void Desconectar(){
        conn = null;
        if(conn!=null){
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion a la base de datos");
        }
    }
    
}
