import java.util.ArrayList;

public class Base {

    private String nombre;

    private ArrayList<BaseNormal>basesNormales;

    public Base(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float tiempoPromAsistencia(){
        float tiempoPromAsistencia = 0;
        for(BaseNormal base : basesNormales){
            tiempoPromAsistencia = tiempoPromAsistencia + base.getTiempoAsistencia();
        }
        tiempoPromAsistencia = tiempoPromAsistencia / basesNormales.size();
        return  tiempoPromAsistencia;
    }

    public int getCantAmb(){
        int cantAmb = 0;
        for(BaseNormal base : basesNormales){
            cantAmb = cantAmb + base.getCantAmb();
        }
        return cantAmb;
    }


}
