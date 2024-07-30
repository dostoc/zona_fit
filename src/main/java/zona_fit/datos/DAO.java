package zona_fit.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public abstract class DAO<T> {
    protected Connection connection;

    public DAO(Connection connection) {
        this.connection = connection;
    }



    public abstract T obtenerPorId(int id);

    public abstract List<T> listarTodos();

    public abstract T obtenerPorNombre(int nombre);

    public abstract T obtenerPorNroCliente(int nroCliente);

    //


    // ... otros métodos comunes ...

    protected void cerrarRecursos(PreparedStatement ps, ResultSet rs) {
        // Código para cerrar el PreparedStatement y el ResultSet
    }
}
