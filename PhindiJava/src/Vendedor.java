import java.util.ArrayList;

public class Vendedor {
    private Usuario usuario;
    private String nombre;
    private int dni;
    private ArrayList<Persona> clientes;
    private ArrayList<Publicacion> propiedades;
    private int telefono;

    public Vendedor(Usuario usuario, String nombre, int dni, ArrayList<Persona> clientes, ArrayList<Publicacion> propiedades, int telefono) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.dni = dni;
        this.clientes = clientes;
        this.propiedades = propiedades;
        this.telefono = telefono;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Persona> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Persona> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Publicacion> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Publicacion> propiedades) {
        this.propiedades = propiedades;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void bajaPublicacion(Publicacion publicacion){

        boolean encontrado = false;
        for (Publicacion propiedad : propiedades) {
            if(propiedad == publicacion){
                encontrado = true;
                propiedades.remove(publicacion);
            }
        }

        if(encontrado == false) {
            System.out.println("no se ha encontrado esa publicacion");
        }

    }

    public void redirigirCliente(Persona cliente, Vendedor vendedor){

        boolean encontrado = false;
        for (Persona clienteee : clientes ) {
            if(clienteee == cliente){
                encontrado = true;
                clientes.remove(cliente);
                ArrayList<Persona> clientesVendedor = vendedor.getClientes();
                clientesVendedor.add(cliente);
                vendedor.setClientes(clientesVendedor);
            }
        }

        if(encontrado == false) {
            System.out.println("no se ha encontrado ese cliente");
        }
    }
}
