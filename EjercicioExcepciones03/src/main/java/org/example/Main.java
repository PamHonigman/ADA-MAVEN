package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Pamela", 55000);

        cliente1.imprimir();
        cliente1.depositar();
        try {
            cliente1.extraer();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        cliente1.imprimir();

    }
}