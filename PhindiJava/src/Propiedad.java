import java.util.ArrayList;

public class Propiedad {
    private int id;
    private String tipo;
    private int superficie;
    private String descripcion;
    private String ubicacion;
    private String operacion;
    private Persona propietario;
    private ArrayList<String> fotos;

    public Propiedad(int id, String tipo, int superficie, String descripcion, String ubicacion, String operacion, Persona propietario, ArrayList<String> fotos) {
        this.id = id;
        this.tipo = tipo;
        this.superficie = superficie;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.operacion = operacion;
        this.propietario = propietario;
        this.fotos = fotos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public ArrayList<String> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<String> fotos) {
        this.fotos = fotos;
    }
}
