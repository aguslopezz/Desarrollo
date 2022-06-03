public class BaseNormal extends Base{

    private float tiempoAsistencia;
    private int cantAmbulancias;

    public BaseNormal(String nombre, float tiempoAsistencia, int cantAmbulancias) {
        super(nombre);
        this.tiempoAsistencia = tiempoAsistencia;
        this.cantAmbulancias = cantAmbulancias;
    }

    public float getTiempoAsistencia() {
        return tiempoAsistencia;
    }

    public void setTiempoAsistencia(float tiempoAsistencia) {
        this.tiempoAsistencia = tiempoAsistencia;
    }

    public int getCantAmbulancias() {
        return cantAmbulancias;
    }

    public void setCantAmbulancias(int cantAmbulancias) {
        this.cantAmbulancias = cantAmbulancias;
    }
}
