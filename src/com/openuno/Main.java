package com.openuno;

public class Main {
    //Gabriel Medranda
    public static void main(String[]args){
        coche co=new coche();
        int resultado = sumar(5, 6, 8);
        System.out.println("Resultado: "+resultado);
        co.aumentarpuertas(1);
    }

    public static int sumar(int numuno, int numdos, int numtres){
        int suma=0;
                suma=numuno+numdos+numtres;
        return suma;
    }

}
