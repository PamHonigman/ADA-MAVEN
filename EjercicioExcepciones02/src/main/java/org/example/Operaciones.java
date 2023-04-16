package org.example;

public class Operaciones {

    private int n1;
    private int n2;

    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void suma(){
        int suma = n1 + n2;
        System.out.println("El resultado de la suma es: " + suma);
    }

    public void resta(){
        int resta = n1 - n2;
        System.out.println("El resultado de la resta es: " + resta);
    }

    public void multiplicacion(){
        int producto = n1 * n2;
        System.out.println("El producto de la multiplicación es: " + producto);
    }

    public void division() throws Exception{

        if (n2 == 0)
           throw new Exception("No es posible dividir por cero");

        int division = n1 / n2;
        System.out.println("El resultado de la división es: " + division);
    }

}
