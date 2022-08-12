import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Inmobiliaria {

    private Usuario usuario;
    private String nombre;
    private ArrayList<Vendedor> vendedores;
    private String estado;
    private Plan plan;
    private HashMap<Date, Float> pagos;

    public Inmobiliaria(Usuario usuario, String nombre, ArrayList<Vendedor> vendedores, String estado, Plan plan, HashMap<Date, Float> pagos) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.vendedores = vendedores;
        this.estado = estado;
        this.plan = plan;
        this.pagos = pagos;
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

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public HashMap<Date, Float> getPagos() {
        return pagos;
    }

    public void setPagos(HashMap<Date, Float> pagos) {
        this.pagos = pagos;
    }

    public void eliminarVendedor(Vendedor vendedorEliminado) {

        boolean encontrado = false;

        for (Vendedor vendedor : vendedores) {

            if(vendedor == vendedorEliminado) {
                vendedores.remove(vendedorEliminado);
                encontrado = true;
            }

        }

        if(encontrado == false) {
            System.out.println("No se encontro ese vendedor");
        }
    }

    public  void cambiarPlan(Plan plan) {

        float precioActual = this.plan.getPrecio();
        float precioNuevo = plan.getPrecio();
        boolean pago = false;

        if(precioActual > precioNuevo) {
            float monto = precioNuevo - precioActual;
            pago = pagar(monto);
        }

        //Si el precio es igual o menor no se paga ni se devuelve nada

        if(pago == true) {
            setPlan(plan);
        }
        else {
            System.out.println("No se pudo realizar el pago");
        }

    }

    public boolean pagar(float monto) {
        /* Logica de pago con APIs externas

        if(pago se realizo) {
            return true
        }
        else {
            sout("Fallo realizando el pago")
            return false
        }
        */

        pagos.put(new Date(), monto);

        return true;
    }
}
