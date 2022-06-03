import java.util.ArrayList;

public class Impresora {

    private ArrayList<Impresion> colaDeImpresiones;
    ArrayList<Dispositivo>dispositivosConectados;

    private static Impresora instance;

    public Impresora() {

        this.colaDeImpresiones = new ArrayList<>();
        this.dispositivosConectados = new ArrayList<>();
    }




    public ArrayList<Impresion> getColaDeImpresiones() {
        return colaDeImpresiones;
    }

    public void setColaDeImpresiones(ArrayList<Impresion> colaDeImpresiones) {
        this.colaDeImpresiones = colaDeImpresiones;
    }

    public ArrayList<Dispositivo> getDispositivosConectados() {
        return dispositivosConectados;
    }

    public void setDispositivosConectados(ArrayList<Dispositivo> dispositivosConectados) {
        this.dispositivosConectados = dispositivosConectados;
    }


    public void realizaImpresion(Impresion impresion){
        System.out.print("La impresion numero " + colaDeImpresiones.get(0).getIdImpresion());
        colaDeImpresiones.remove(impresion);
    }

    public void agregarImpresionALacola(Impresion impresion){
        colaDeImpresiones.add(impresion);
        System.out.print("Se agrego a la cola la impresion con el id " + impresion.getIdImpresion());
    }

}
