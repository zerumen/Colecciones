/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;
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
        
        for(Coche coche: coches){
            if(coches.indexOf(coche)== 1){
                System.out.println("Marca:" + coche.getMarca()
                        + " Modelo:" + coche.getModelo() + " Cilindrada:"
                        + coche.getCilindrada() + " DNI:"
                        + coche.getDniPropietario());
            }
        }
        System.out.println("-----------------");
        
        for(Coche coche: coches){
            System.out.println("Marca: "+coche.getMarca()+" Modelo:"+coche.getModelo());
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Dime el DNI: ");
        String dni = sc.next();
        
        for(Coche coche: coches){
            String dniPropietario = coche.getDniPropietario();
            if(dniPropietario.equals(dni)){
                System.out.println("Modelo: "+coche.getModelo());
            }
        }
        
        System.out.println("-----------------");
        for(Coche coche : coches){
            
            if(coche.getMarca().equals(Marca.FORD)){
                System.out.println("Marca:" + coche.getMarca()
                        + " Modelo:" + coche.getModelo() + " Cilindrada:"
                        + coche.getCilindrada() + " DNI:"
                        + coche.getDniPropietario());
            }
        }
        
    }
}
