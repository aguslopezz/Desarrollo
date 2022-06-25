package com.company;

public class EstrategiaEnvioLargo extends Calculo {
    @Override
    public float ejecutarEstrategia(Envio envio){
        return envio.getPesoPaquete() * 4;
    }
}
