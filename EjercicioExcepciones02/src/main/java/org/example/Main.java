package org.example;

public class Main {
    public static void main(String[] args) {

        Operaciones operaciones1 = new Operaciones(10, 2);

        operaciones1.suma();
        operaciones1.resta();
        operaciones1.multiplicacion();

        try {
            operaciones1.division();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}