/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author alumno
 */
public class Coche {

    private Marca marca;
    private String modelo;
    private int cilindrada;
    private Persona propietario;

   
    public Coche() {
    }

    public Coche(Marca marca, String modelo, int cilindrada, String dniPropietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.propietario= propietario;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

   
     public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

}
