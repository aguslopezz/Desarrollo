package com.company;

public class EstrategiaEnvioLocal extends Calculo{

    @Override
    public float ejecutarEstrategia(Envio envio){
        return envio.getPesoPaquete() * 2;
    }
}
