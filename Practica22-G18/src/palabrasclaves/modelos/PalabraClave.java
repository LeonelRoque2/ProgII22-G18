/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palabrasclaves.modelos;

/**
 *
 * @author estudiante
 */
public class PalabraClave {
    private String nombre;

    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }
     
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
     @Override
    public String toString() {
        return "PalabraClave: " + nombre;
    }
    
}
