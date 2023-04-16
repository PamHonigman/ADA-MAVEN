package org.example;

import java.util.Scanner;

public class Cliente {

    private String nombre;
    private int monto;

    Scanner in = new Scanner(System.in);

    public Cliente(String nombre, int monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public void depositar(){
        System.out.println("Ingrese el monto a depositar");
        int deposito = in.nextInt();

        monto += deposito;
    }

    public void extraer() throws Exception {
        System.out.println("Ingrese el monto que desea extraer");
        int extraccion = in.nextInt();

        if (extraccion < 0)
            throw new Exception ("No es posible continuar con la operación. El monto a extraer supera el saldo actual" +
                    " " +
                    "de la cuenta");
        monto -= extraccion;
    }

    public void imprimir(){
        System.out.println("El saldo actual de la cuenta de " + nombre + " es: " + monto);
    }



}
