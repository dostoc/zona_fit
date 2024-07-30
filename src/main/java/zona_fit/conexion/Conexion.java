package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/zona_fit_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection conexion = null;

    public static Connection getConexion() throws SQLException {
        if (conexion == null) {
            try {
                // Cargar el driver de MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Establecer la conexión
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa a la base de datos");
            } catch (ClassNotFoundException e) {
                System.out.println("Error al cargar el driver de MySQL: " + e.getMessage());
                throw new SQLException(e);
            } catch (SQLException e) {
                System.out.println("Error al conectar a la base de datos: " + e.getMessage());
                throw e;
            }
        }
        return conexion;
    }

    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            // Obtener la conexión
            Connection con = Conexion.getConexion();
            // Usar la conexión
            if(con != null){
                System.out.println("Conexion exitosa: " + con);
            } else {
                System.out.println("Error al conectarse");
            }
            // Cerrar la conexión
            Conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
