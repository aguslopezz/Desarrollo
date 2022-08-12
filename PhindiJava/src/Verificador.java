import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class Verificador {

    private ArrayList<Inmobiliaria> inmobiliarias;
    private Verificador verificador = null;

    //Usamos un Singleton porque solo debe haber un verificador
    private Verificador(ArrayList<Inmobiliaria> inmobiliarias) {
        this.inmobiliarias = inmobiliarias;
    }

    public Verificador newVerificador(ArrayList<Inmobiliaria> inmobiliarias) {
        if(verificador == null) {
            verificador = new Verificador(inmobiliarias);
        }
        else {
            System.out.println("No se puede crear un segundo verificador");
        }

        return verificador;
    }

    public ArrayList<Inmobiliaria> getInmobiliarias() {
        return inmobiliarias;
    }

    public void setInmobiliarias(ArrayList<Inmobiliaria> inmobiliarias) {
        this.inmobiliarias = inmobiliarias;
    }

    public Verificador getVerificador() {
        return verificador;
    }

    public void setVerificador(Verificador verificador) {
        this.verificador = verificador;
    }

    public void verificarPagos() {

        Date date = new Date();
        int mes = date.getMonth();
        date.setMonth(mes + 1);

        for (Inmobiliaria inmobiliaria : inmobiliarias) {
            HashMap<Date, Float> pagos = inmobiliaria.getPagos();
            HashMap<Date, Float> ultimoPago = tomarUltimoPago(pagos);
            Set<Date> key = ultimoPago.keySet();
            Date fechaUltPago = valorKey(key);

            if(fechaUltPago.before(date) ) {
                inmobiliaria.setEstado("bloqueado");
            }
        }
    }

    private HashMap<Date, Float> tomarUltimoPago(HashMap<Date, Float> pagos) {

        HashMap<Date, Float> ultimoPago = pagos;

        for(Date fechaUltPago : pagos.keySet()) {
            ultimoPago.clear();
            float monto = pagos.get(fechaUltPago);
            ultimoPago = new HashMap<Date, Float>(fechaUltPago, monto);
        }

        return ultimoPago;
    }

    private Date valorKey(Set<Date> key) {

        Date fecha = null;

        for (Date keyValue : key) {
            fecha = keyValue;
        }

        return fecha;
    }
}
