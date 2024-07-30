package zona_fit.dao;

import zona_fit.dominio.Cliente;

import java.util.List;

public class IClienteDAO implements DAO<Cliente, Integer>{
    @Override
    public void insertar(Cliente generico) {

    }

    @Override
    public List<Cliente> listar() {
        return List.of();
    }

    @Override
    public Cliente obtener(Integer id) {
        return null;
    }

    @Override
    public void modificar(Cliente generico) {

    }

    @Override
    public void borrar(Cliente generico) {

    }
}
