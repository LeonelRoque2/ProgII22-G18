/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicaciones.modelos;

import autores.modelos.Profesor;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Administrador
 */
public class Publicacion {
    private String titulo;
    private Profesor profesor;
    private LocalDate fechaPublicacion;
    private Tipo tipo;
    private Idioma idioma;
    private Lugar lugar;
    private ArrayList <PalabraClave> palabrasClaves;
    private String enlace;
    private String resumen;

    public Publicacion(String titulo, Profesor profesor, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen) {
        this.titulo = titulo;
        this.profesor = profesor;
        this.fechaPublicacion = fechaPublicacion;
        this.tipo = tipo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.palabrasClaves = palabrasClaves;
        this.enlace = enlace;
        this.resumen = resumen;
    }

    public String verTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Profesor verProfesor() {
        return profesor;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public LocalDate verFechaPublicacion() {
        return fechaPublicacion;
    }

    public void asignarFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Tipo verTipo() {
        return tipo;
    }

    public void asignarTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Idioma verIdioma() {
        return idioma;
    }

    public void asignarIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Lugar verLugar() {
        return lugar;
    }

    public void asignarLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public ArrayList <PalabraClave> verPalabrasClaves() {
        return palabrasClaves;
    }

    public void asignarPalabrasClaves(ArrayList <PalabraClave> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public String verEnlace() {
        return enlace;
    }

    public void asignarEnlace(String enlace) {
        this.enlace = enlace;
    }
    
     public String verResumen() {
        return resumen;
    }

    public void asignarResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public void mostrar(){
        System.out.println("Título: " +this.titulo);
        System.out.println("Autor: " + this.profesor.verApellidos() + ", " +this.profesor.verNombres());
        System.out.println("Fecha de publicación: " + this.fechaPublicacion);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Idioma: " +this.idioma);
        System.out.println("Lugar: " +this.lugar);
        System.out.println("Palabras claves");
        System.out.println("---------------");
        for(PalabraClave pc : palabrasClaves)
            System.out.println(pc);
        System.out.println("Enlace: " +this.enlace);
        System.out.println("Resumen: " +this.resumen);
    }
}
