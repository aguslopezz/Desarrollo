package com.company;

public class Envio {
    private String distancia;
    private Calculo estrategia;
    private Cliente cliente;
    private Transportista transportista;
    private int pesoPaquete;
    

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(int pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public Calculo getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Calculo estrategia) {
        this.estrategia = estrategia;
    }

    public Envio(String distancia, int pesoPaquete, Cliente cliente, Transportista transportista, Calculo estrategia) {
        this.distancia = distancia;
        this.pesoPaquete = pesoPaquete;
        this.cliente = cliente;
        this.transportista = transportista;
        this.estrategia = estrategia;
    }
}
