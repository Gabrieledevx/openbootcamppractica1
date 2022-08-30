package com.openuno;

public class coche {
    //Gabriel Medranda
    int numpuertas=0;

    public int aumentarpuertas(int nuevapuerta){
        numpuertas=nuevapuerta+numpuertas;
        System.out.println("El numero de puertas es: "+numpuertas);
        return numpuertas;
    }
}
