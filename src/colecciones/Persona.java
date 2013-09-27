/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Persona {
      private String nombre;
    private String ape1;
    private Sexo sexos;
    private String dni;

   
    private List<Coche> coches=new ArrayList<>();

    public Persona(String dni,String nombre, String ape1, Sexo sexos) {
        this.dni=dni;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.sexos = sexos;
        this.coches= new ArrayList<>();
    }

    public Persona() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return this.ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public Sexo getsexos() {
        return sexos;

    }

    public void setsexos(Sexo sexos) {
        this.sexos = sexos;
    }

    public String getNombreCompleto() {
        String nombreCompleto;
        nombreCompleto = this.nombre + " " + this.ape1;
        return nombreCompleto;


    }
    public String getDni(){
        return dni;
        
    }
    public void setDni(String dni){
        this.dni=dni;
        
    }
     public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }
}

