package zona_fit.dominio;

import javax.persistence.Column;

public class Cliente {

    private int id;
    private String nombre;
    private String apellido;

    @Column(name = "nro_cliente")
    private int nroCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int nroCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCliente = nroCliente;
    }

    public Cliente(int id, String nombre, String apellido, int nroCliente) {
        this(nombre, apellido, nroCliente);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

