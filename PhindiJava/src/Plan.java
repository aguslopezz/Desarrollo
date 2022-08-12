public class Plan {

    private String nombre;
    private float precio;
    private int cantVendedores;

    public Plan(String nombre, float precio, int cantVendedores) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantVendedores = cantVendedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantVendedores() {
        return cantVendedores;
    }

    public void setCantVendedores(int cantVendedores) {
        this.cantVendedores = cantVendedores;
    }
}
