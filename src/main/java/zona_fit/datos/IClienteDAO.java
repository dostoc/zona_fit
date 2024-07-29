package zona_fit.datos;

import zona_fit.dominio.Cliente;

import java.util.List;

public interface IClienteDAO {


    List<Cliente> listarClientes();

    // Estos devuelven valores boléanos para indicar que la operacion se realizo correctamente
    boolean buscarClientePorId(Cliente cliente);

    boolean agregarCliete(Cliente cliente);

    boolean modificarCliente(Cliente cliente);

    boolean eliminarCliete(Cliente cliente);

}
