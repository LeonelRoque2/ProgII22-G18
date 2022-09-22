/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
       
//        Alumno alumno1=new Alumno();
//        Alumno alumno2=new Alumno();
//        Alumno alumno3=new Alumno();
//        Alumno alumno4=new Alumno();
//        Alumno alumno5=new Alumno();
//        
//        Profesor profe1 =new Profesor();
//        Profesor profe2 =new Profesor();
//        Profesor profe3 =new Profesor();
//        Profesor profe4 =new Profesor();
//        Profesor profe5 =new Profesor();
//        
        Idioma idioma1= new Idioma("Inglés");
        Idioma idioma2= new Idioma("Francés");
        Idioma idioma3= new Idioma("Alemán");
        Idioma idioma4= new Idioma("Español");
        Idioma idioma5= new Idioma("Chino");
        
        System.out.println(idioma1.toString());
        System.out.println(idioma2.toString());
        System.out.println(idioma3.toString());
        System.out.println(idioma4.toString());
        System.out.println(idioma5.toString());
         
        Lugar lugar1= new Lugar("facultad");
        Lugar lugar2= new Lugar("congreso");
        Lugar lugar3= new Lugar("revista cientifica");
        Lugar lugar4= new Lugar("libro");
        Lugar lugar5= new Lugar("laboratorio");
        
        System.out.println(lugar1.toString());
        System.out.println(lugar2.toString());
        System.out.println(lugar3.toString());
        System.out.println(lugar4.toString());
        System.out.println(lugar5.toString());
        
        PalabraClave clave1=new PalabraClave("123456");
        PalabraClave clave2=new PalabraClave("abcde");
        PalabraClave clave3=new PalabraClave("fghij");
        PalabraClave clave4=new PalabraClave("klmnñ");
        PalabraClave clave5=new PalabraClave("opqrs");
        
        System.out.println(clave1.toString());
        System.out.println(clave2.toString());
        System.out.println(clave3.toString());
        System.out.println(clave4.toString());
        System.out.println(clave5.toString());
               
        Tipo tipo1=new Tipo("trabajo en congreso");
        Tipo tipo2=new Tipo("capítulo de libro");
        Tipo tipo3=new Tipo("libro");
        Tipo tipo4=new Tipo("tesis");
        Tipo tipo5=new Tipo("etc");
        
        System.out.println(tipo1.toString());
        System.out.println(tipo2.toString());
        System.out.println(tipo3.toString());
        System.out.println(tipo4.toString());
        System.out.println(tipo5.toString());
        
        Grupo grupo1=new Grupo("G1","2 integrantes");
        Grupo grupo2=new Grupo("G2","4 integrantes");
        Grupo grupo3=new Grupo("G3","3 integrantes");
        Grupo grupo4=new Grupo("G4","5 integrantes");
        Grupo grupo5=new Grupo("G5", "4 integrantes");
        
        grupo1.mostrar();
        grupo2.mostrar();
        grupo3.mostrar();
        grupo4.mostrar();
        grupo5.mostrar();

    }
}
