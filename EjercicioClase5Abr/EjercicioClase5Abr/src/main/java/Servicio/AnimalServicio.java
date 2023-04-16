package Servicio;

import Entidad.Animal;
import Persistencia.AnimalDao;

import java.util.List;

public class AnimalServicio {

    private final AnimalDao animalDao;

    public AnimalServicio() {
        animalDao = new AnimalDao();
    }

    public void printAnimal() throws Exception {
        try {
            List<Animal> animals = animalDao.getAnimal();

            if (animals.isEmpty()) {
                throw new Exception("No existen registros");
            } else {
                System.out.println("LISTA DE ANIMALES\n");
                System.out.printf("%-15s%-15s%-20s\n", "NOMBRE", "AÑOS", "RAZA");

                for (Animal animal : animals) {
                    System.out.printf("%-15s%-15s%-20s\n", animal.getNombre(), animal.getAños(), animal.getRaza());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }





}
