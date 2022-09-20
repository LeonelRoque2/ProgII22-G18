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
        ArrayList <Alumno> arrayAlumno= new ArrayList<>();
        ArrayList <Profesor> arrayProfesor= new ArrayList<>();
        ArrayList <Idioma> arrayIdioma= new ArrayList<>();
        ArrayList <Lugar> arrayLugar= new ArrayList<>();
        ArrayList <PalabraClave> arrayPalabraClave= new ArrayList<>();
        ArrayList <Tipo> arrayTipo= new ArrayList<>();
        ArrayList <Grupo> arrayGrupo= new ArrayList<>();
        
        
        Alumno alumno1=new Alumno();
        Alumno alumno2=new Alumno();
        Alumno alumno3=new Alumno();
        Alumno alumno4=new Alumno();
        Alumno alumno5=new Alumno();
        
        arrayAlumno.add(alumno1);
        arrayAlumno.add(alumno2);
        arrayAlumno.add(alumno3);
        arrayAlumno.add(alumno4);
        arrayAlumno.add(alumno5);
        
        Profesor profe1 =new Profesor();
        Profesor profe2 =new Profesor();
        Profesor profe3 =new Profesor();
        Profesor profe4 =new Profesor();
        Profesor profe5 =new Profesor();
        
        arrayProfesor.add(profe1);
        arrayProfesor.add(profe2);
        arrayProfesor.add(profe3);
        arrayProfesor.add(profe4);
        arrayProfesor.add(profe5);
        
        Idioma idioma1= new Idioma();
        Idioma idioma2= new Idioma();
        Idioma idioma3= new Idioma();
        Idioma idioma4= new Idioma();
        Idioma idioma5= new Idioma();
        
        arrayIdioma.add(idioma1);
        arrayIdioma.add(idioma2);
        arrayIdioma.add(idioma3);
        arrayIdioma.add(idioma4);
        arrayIdioma.add(idioma5);
        
        Lugar lugar1= new Lugar();
        Lugar lugar2= new Lugar();
        Lugar lugar3= new Lugar();
        Lugar lugar4= new Lugar();
        Lugar lugar5= new Lugar();
        
        arrayLugar.add(lugar1);
        arrayLugar.add(lugar2);
        arrayLugar.add(lugar3);
        arrayLugar.add(lugar4);
        arrayLugar.add(lugar5);
        
        PalabraClave clave1=new PalabraClave();
        PalabraClave clave2=new PalabraClave();
        PalabraClave clave3=new PalabraClave();
        PalabraClave clave4=new PalabraClave();
        PalabraClave clave5=new PalabraClave();
        
        arrayPalabraClave.add(clave1);
        arrayPalabraClave.add(clave2);
        arrayPalabraClave.add(clave3);
        arrayPalabraClave.add(clave4);
        arrayPalabraClave.add(clave5);
        
        Tipo tipo1=new Tipo();
        Tipo tipo2=new Tipo();
        Tipo tipo3=new Tipo();
        Tipo tipo4=new Tipo();
        Tipo tipo5=new Tipo();
        
        arrayTipo.add(tipo1);
        arrayTipo.add(tipo2);
        arrayTipo.add(tipo3);
        arrayTipo.add(tipo4);
        arrayTipo.add(tipo5);
        
        Grupo grupo1=new Grupo();
        Grupo grupo2=new Grupo();
        Grupo grupo3=new Grupo();
        Grupo grupo4=new Grupo();
        Grupo grupo5=new Grupo();
        
        arrayGrupo.add(grupo1);
        arrayGrupo.add(grupo2);
        arrayGrupo.add(grupo3);
        arrayGrupo.add(grupo4);
        arrayGrupo.add(grupo5);
        
        for(Alumno a: arrayAlumno)
            System.out.println(a);
        
        for(Profesor a: arrayProfesor)
            System.out.println(a);
        
        for(Idioma a: arrayIdioma)
            System.out.println(a);
        
        for(Lugar a: arrayLugar)
            System.out.println(a);
        
        for(PalabraClave a: arrayPalabraClave)
            System.out.println(a);
        
        for(Tipo a: arrayTipo)
            System.out.println(a);
        
        for(Grupo a: arrayGrupo)
            System.out.println(a);
    }
}
