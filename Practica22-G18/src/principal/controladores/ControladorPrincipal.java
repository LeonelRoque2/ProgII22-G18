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
        
       
        Alumno alumno1=new Alumno(10,"Perez","Juan","1234","100");
        Alumno alumno2=new Alumno(11,"Martinez","Pedro","4321","101");
        Alumno alumno3=new Alumno(12,"Alvarez","Luciana","5678","102");
        Alumno alumno4=new Alumno(13,"Paz","Maria","8765","103");
        Alumno alumno5=new Alumno(14,"Romano","Nahuel","9999","104");
        
        arrayAlumno.add(alumno1);
        arrayAlumno.add(alumno2);
        arrayAlumno.add(alumno3);
        arrayAlumno.add(alumno4);
        arrayAlumno.add(alumno5);
        
        Profesor profe1 =new Profesor(1, "Nieva","Lucas","abcd","Titular");
        Profesor profe2 =new Profesor(2, "Moran", "Sofia", "rojo", "JTP");
        Profesor profe3 =new Profesor(3, "Casas", "Martín", "verde","Titular");
        Profesor profe4 =new Profesor(4, "Salazar", "Jesús", "otoño", "ADG");
        Profesor profe5 =new Profesor(5, "Estevanez", "Luis", "abril", "Asociado");
        
        arrayProfesor.add(profe1);
        arrayProfesor.add(profe2);
        arrayProfesor.add(profe3);
        arrayProfesor.add(profe4);
        arrayProfesor.add(profe5);
        
        Idioma idioma1= new Idioma("Inglés");
        Idioma idioma2= new Idioma("Francés");
        Idioma idioma3= new Idioma("Alemán");
        Idioma idioma4= new Idioma("Español");
        Idioma idioma5= new Idioma("Chino");
       
//        System.out.println(idioma1.toString());
//        System.out.println(idioma2.toString());
//        System.out.println(idioma3.toString());
//        System.out.println(idioma4.toString());
//        System.out.println(idioma5.toString());
        
        arrayIdioma.add(idioma1);
        arrayIdioma.add(idioma2);
        arrayIdioma.add(idioma3);
        arrayIdioma.add(idioma4);
        arrayIdioma.add(idioma5);
         
        Lugar lugar1= new Lugar("facultad");
        Lugar lugar2= new Lugar("congreso");
        Lugar lugar3= new Lugar("revista cientifica");
        Lugar lugar4= new Lugar("libro");
        Lugar lugar5= new Lugar("laboratorio");
        
//        System.out.println(lugar1.toString());
//        System.out.println(lugar2.toString());
//        System.out.println(lugar3.toString());
//        System.out.println(lugar4.toString());
//        System.out.println(lugar5.toString());
        
        arrayLugar.add(lugar1);
        arrayLugar.add(lugar2);
        arrayLugar.add(lugar3);
        arrayLugar.add(lugar4);
        arrayLugar.add(lugar5);
        
        PalabraClave clave1=new PalabraClave("123456");
        PalabraClave clave2=new PalabraClave("abcde");
        PalabraClave clave3=new PalabraClave("fghij");
        PalabraClave clave4=new PalabraClave("klmnñ");
        PalabraClave clave5=new PalabraClave("opqrs");
        
//        System.out.println(clave1.toString());
//        System.out.println(clave2.toString());
//        System.out.println(clave3.toString());
//        System.out.println(clave4.toString());
//        System.out.println(clave5.toString());
        
        arrayPalabraClave.add(clave1);
        arrayPalabraClave.add(clave2);
        arrayPalabraClave.add(clave3);
        arrayPalabraClave.add(clave4);
        arrayPalabraClave.add(clave5);
               
        Tipo tipo1=new Tipo("trabajo en congreso");
        Tipo tipo2=new Tipo("capítulo de libro");
        Tipo tipo3=new Tipo("libro");
        Tipo tipo4=new Tipo("tesis");
        Tipo tipo5=new Tipo("etc");
        
//        System.out.println(tipo1.toString());
//        System.out.println(tipo2.toString());
//        System.out.println(tipo3.toString());
//        System.out.println(tipo4.toString());
//        System.out.println(tipo5.toString());
        
        arrayTipo.add(tipo1);
        arrayTipo.add(tipo2);
        arrayTipo.add(tipo3);
        arrayTipo.add(tipo4);
        arrayTipo.add(tipo5);
        
        Grupo grupo1=new Grupo("G1","2 integrantes");
        Grupo grupo2=new Grupo("G2","4 integrantes");
        Grupo grupo3=new Grupo("G3","3 integrantes");
        Grupo grupo4=new Grupo("G4","5 integrantes");
        Grupo grupo5=new Grupo("G5", "4 integrantes");
        
//        grupo1.mostrar();
//        grupo2.mostrar();
//        grupo3.mostrar();
//        grupo4.mostrar();
//        grupo5.mostrar();
        
        arrayGrupo.add(grupo1);
        arrayGrupo.add(grupo2);
        arrayGrupo.add(grupo3);
        arrayGrupo.add(grupo4);
        arrayGrupo.add(grupo5);
        
        for(Alumno a: arrayAlumno)
            System.out.println("Alumno: " +a.verApellidos()+ ", " +a.verNombres()+ " dni: "+a.verDni()+ " cx: " +a.verCx());
        
        for(Profesor a: arrayProfesor)
            System.out.println("Profesor: " +a.verApellidos()+ ", " +a.verNombres()+ " dni: " +a.verDni()+ " cargo: " +a.verCargo());
        
        for(Idioma a: arrayIdioma)
            System.out.println(a);
        
        for(Lugar a: arrayLugar)
            System.out.println(a);
        
        for(PalabraClave a: arrayPalabraClave)
            System.out.println(a);
        
        for(Tipo a: arrayTipo)
            System.out.println(a);
        
        for(Grupo a: arrayGrupo)
            System.out.println("Grupo: " +a.verNombre()+ " Descripción: " +a.verDescripcion());
        
        
        alumno1.asignarApellidos("Rocha");
        alumno1.asignarDni(3000);
        alumno1.asignarCx("10880");
        alumno2.asignarNombres("Julieta Marisol");
        alumno2.asignarClave("2002020");
        alumno5.asignarApellidos("Carranza Martinez");
        alumno5.asignarDni(88929);
        
        profe1.asignarApellidos("Ruiz Abalos");
        profe1.asignarCargo("JTP");
        profe1.asignarNombres("Martín Andrés Luis");
        profe4.asignarDni(222222);
        profe4.asignarNombres("Mariana Josefina");
        profe5.asignarCargo("Titular");
        profe5.asignarClave("eeeeeee");
        
        idioma1.asignarNombre("Hebreo");
        idioma3.asignarNombre("Catalán");
        
        lugar1.asignarNombre("revista cientifica");
        lugar4.asignarNombre("facultad");
        
        clave3.asignarNombre("939heue");
        clave5.asignarNombre("repositorio");
        
        tipo2.asignarNombre("tesis");
        tipo5.asignarNombre("trabajo en congreso");
        
        grupo1.asignarNombre("GRUPO uno");
        grupo1.asignarDescripcion("1 solo integrante");
        grupo4.asignarDescripcion("8 integrantes");
        grupo5.asignarNombre("GRUPO CINCO");
        grupo5.asignarDescripcion("Nuevo grupo");
        
        for(Alumno a: arrayAlumno)
            System.out.println("Alumno: " +a.verApellidos()+ ", " +a.verNombres()+ " dni: "+a.verDni()+ " cx: " +a.verCx());
        
        for(Profesor a: arrayProfesor)
            System.out.println("Profesor: " +a.verApellidos()+ ", " +a.verNombres()+ " dni: " +a.verDni()+ " cargo: " +a.verCargo());
        
        for(Idioma a: arrayIdioma)
            System.out.println(a);
        
        for(Lugar a: arrayLugar)
            System.out.println(a);
        
        for(PalabraClave a: arrayPalabraClave)
            System.out.println(a);
        
        for(Tipo a: arrayTipo)
            System.out.println(a);
        
        for(Grupo a: arrayGrupo)
            System.out.println("Grupo: " +a.verNombre()+ " Descripción: " +a.verDescripcion());
           
    }
    
}
