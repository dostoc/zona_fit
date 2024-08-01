package zona_fit.dao.mysql;

import com.sun.tools.javac.Main;
import zona_fit.dao.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlClienteDAO implements IClienteDAO {

    // pensar que sql para cada caso
    // insertar
    final String INSERT = "INSERT INTO cliente(nombre, apellido, nro_cliente) values (?,?,?);";
    final String UPDATE =  "UPDATE cliente SET nombre ?, apellido, nro_cliente = ? WHERE id = ?";
    final String DELETE = "DELETE FROM cliente WHERE id = ?";
    final String GETALL = "SELECT id, nombre, apellido FROM cliente";
    final String GETONE = "SELECT id, nombre, apellido FROM cliente WHERE id = ?";

    private Connection conn;

    public  MySqlClienteDAO (Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(Cliente generico) {

    }

    @Override
    public void modificar(Cliente generico) {

    }

    @Override
    public void borrar(Cliente generico) {

    }

    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public Cliente obtener(Integer id) {
        return null;
    }
}
