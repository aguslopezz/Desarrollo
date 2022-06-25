package com.company;

public class EstrategiaFedEx extends Calculo{
    @Override
    public float ejecutarEstrategia(Envio envio){
        return envio.getPesoPaquete() * 6.4f;
    }
}
