package zona_fit.conexion;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {


    private static Properties databaseProperties(){
        Properties propsConexion = new Properties();
        propsConexion.setProperty("user","root");
        propsConexion.setProperty("password","root");
        return propsConexion;
    }

    private static Connection conexion = null;

    public static Connection getConexion() throws SQLException {
        // try ( ... ) <- try-with-resources cierra la conexion luego de ser usada
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zona_fit_db", databaseProperties())){
            /*
            solo para corroborar que esta conectado a la base de dato
            String dbName = c.getMetaData().getDatabaseProductName();
            String version = c.getMetaData().getDriverVersion();
            System.out.println(dbName + " " + version);
            */

        } catch (SQLException ex) {
            Logger.getLogger(com.sun.tools.javac.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

    public static void main(String[] args) {

        try {
            getConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
