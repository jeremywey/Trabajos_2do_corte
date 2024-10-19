/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerem
 */
// Clase Estudiante
class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Aula que tiene varios Estudiantes (relación de agregación)
class Aula {
    private List<Estudiante> estudiantes;

    public Aula() {
        estudiantes = new ArrayList<>();  // Lista de estudiantes
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);  // Se añade un estudiante al aula
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el aula:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre());
        }
    }
}

// Clase principal para probar
public class main {
    public static void main(String[] args) {
        // Crear varios estudiantes
        Estudiante estudiante1 = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("María");

        // Crear un aula
        Aula aula = new Aula();

        // Agregar estudiantes al aula
        aula.agregarEstudiante(estudiante1);
        aula.agregarEstudiante(estudiante2);

        // Mostrar estudiantes
        aula.mostrarEstudiantes();
    }
}
