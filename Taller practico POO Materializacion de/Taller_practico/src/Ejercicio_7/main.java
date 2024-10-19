/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author jerem
 */
// Clase Empleado (uno de los extremos de la relación)
class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Proyecto (otro extremo de la relación)
class Proyecto {
    private String nombre;

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Asignacion para modelar la relación muchos a muchos entre Empleado y Proyecto
class Asignacion {
    private Empleado empleado;
    private Proyecto proyecto;

    public Asignacion(Empleado empleado, Proyecto proyecto) {
        this.empleado = empleado;
        this.proyecto = proyecto;
    }

    public void mostrarAsignacion() {
        System.out.println(empleado.getNombre() + " está asignado al proyecto " + proyecto.getNombre());
    }
}

// Clase principal para probar
public class main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan");
        Empleado empleado2 = new Empleado("María");

        // Crear proyectos
        Proyecto proyecto1 = new Proyecto("Proyecto A");
        Proyecto proyecto2 = new Proyecto("Proyecto B");

        // Crear asignaciones
        Asignacion asignacion1 = new Asignacion(empleado1, proyecto1);
        Asignacion asignacion2 = new Asignacion(empleado2, proyecto2);
        Asignacion asignacion3 = new Asignacion(empleado1, proyecto2); // Juan asignado a dos proyectos

        // Mostrar las asignaciones
        asignacion1.mostrarAsignacion();
        asignacion2.mostrarAsignacion();
        asignacion3.mostrarAsignacion();
    }
}
