package Entidad;

public class Animal {

    private String nombre;
    private int años;
    private String raza;

    public Animal() {
    }

    public Animal(String nombre, int años, String raza) {
        this.nombre = nombre;
        this.años = años;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return String.format("ANIMAL (nombre: %s, años: %s, raza: %s)", nombre, años, raza);
    }
}
