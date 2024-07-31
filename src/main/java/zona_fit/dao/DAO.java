package zona_fit.dao;

import java.util.List;

public interface DAO<T, K> {
    // T tipo de objeto generico
    // K tipo de dato de clave primaria

    // CRUD

    //insertar

    void insertar(T generico);


    // modificar
    void modificar(T generico);


    // borrar
    void borrar(T generico);

    // leer

    List<T> listar();

    T obtener(K id);







}
