public class Envio {

    private Calculo estrategia;

    public Envio(Calculo estrategia) {
        this.estrategia = estrategia;
    }

    public void calcularCosto(){}

    public Calculo getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Calculo estrategia) {
        this.estrategia = estrategia;
    }
}
