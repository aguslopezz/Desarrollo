package com.company;

public class EstrategiaUPS extends Calculo{

    @Override
    public float ejecutarEstrategia(Envio envio){
        return envio.getPesoPaquete() * 5.6f;
    }
}
