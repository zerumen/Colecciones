/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Ejercicio 4
        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche(Marca.CITROEN, "Xsara", 125, "48587160M"));
        coches.add(new Coche(Marca.FORD, "Escort", 125, "48597167Q"));
        coches.add(new Coche(Marca.FORD, "Mustang", 95, "48588160M"));
        coches.add(new Coche(Marca.CITROEN, "Xsara", 100, "89687160M"));
        coches.add(new Coche(Marca.RENAULT, "Picasso", 200, "12587160M"));

        for (Coche coche : coches) {
            if (coches.indexOf(coche) == 1) {
                System.out.println("Marca:" + coche.getMarca()
                        + " Modelo:" + coche.getModelo() + " Cilindrada:"
                        + coche.getCilindrada() + " DNI:"
                        + coche.getPropietario());
            }
        }
        System.out.println("-----------------");

        for (Coche coche : coches) {
            System.out.println("Marca: " + coche.getMarca() + " Modelo:" + coche.getModelo());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Dime el DNI: ");
        String dni = scanner.next();

        for (Coche coche : coches) {
            Persona dniPropietario = coche.getPropietario();
            if (dniPropietario.equals(dni)) {
                System.out.println("Modelo: " + coche.getModelo());
            }
        }

        System.out.println("-----------------");
        for (Coche coche : coches) {

            if (coche.getMarca().equals(Marca.FORD)) {
                System.out.println("Marca:" + coche.getMarca()
                        + " Modelo:" + coche.getModelo() + " Cilindrada:"
                        + coche.getCilindrada() + " DNI:"
                        + coche.getPropietario());
            }
        }

        //Ejercicio 5
        System.out.println("-----------------");
        Map<String, Coche> mapCoche = new HashMap<String, Coche>();

        mapCoche.put("08587160M", new Coche(Marca.CITROEN, "Xsara", 125, "08587160M"));
        mapCoche.put("12345678Z", new Coche(Marca.FORD, "Escort", 125, "12345678Z"));
        mapCoche.put("55520160M", new Coche(Marca.FORD, "Mustang", 95, "55520160M"));
        mapCoche.put("7857160M", new Coche(Marca.CITROEN, "Xsara", 100, "7857160M"));
        mapCoche.put("48417160M", new Coche(Marca.RENAULT, "Picasso", 200, "48417160M"));

        System.out.println("Marca: " + mapCoche.get("12345678Z").getMarca());
        System.out.println("Cilindrada: " + mapCoche.get("12345678Z").getCilindrada());
        System.out.println("Modelo: " + mapCoche.get("12345678Z").getModelo());
        System.out.println("Dni: " + mapCoche.get("12345678Z").getPropietario());

        System.out.println("-----------------");

        for (String clave : mapCoche.keySet()) {
            System.out.println("DNI:" + mapCoche.get(clave).getPropietario()
                    + " Marca: " + mapCoche.get(clave).getModelo() + " Modelo: "
                    + mapCoche.get(clave).getMarca());
        }

        System.out.println("-----------------");

        System.out.println("Dime un DNI:");
        dni = scanner.next();

        System.out.println("Modelo: " + mapCoche.get(dni).getModelo());

        System.out.println("-----------------");

        for (String clave : mapCoche.keySet()) {
            if (mapCoche.get(clave).getMarca() == Marca.FORD) {
                System.out.println("DNI:" + mapCoche.get(clave).getPropietario()
                        + " Marca: " + mapCoche.get(clave).getModelo() + " Modelo: "
                        + mapCoche.get(clave).getMarca());
            }
        }
    }
}
