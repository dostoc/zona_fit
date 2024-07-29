package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConexion() throws SQLException {
        Connection conexion = null;

        String baseDatos = "zona_fit_db";
        String url = "jdbc:mysql://localhost:3306/" + baseDatos;
        String usuario = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,usuario,password);
        }
        catch (Exception e){
            System.out.println("Error al conectar a la base de datos");
            throw new SQLException(e);
        }
        return conexion;
    }

    public static void main(String[] args) throws SQLException {
        var conexion = getConexion();
        if(conexion != null){
            System.out.println("Conexion exitosa" + conexion);
        } else {
            System.out.println("Error al conectarse");
        }
    }

}
