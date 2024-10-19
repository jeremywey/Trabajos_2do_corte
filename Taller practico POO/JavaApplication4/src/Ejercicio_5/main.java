/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author jerem
 */
// Clase Padre con un método protegido
class ClasePadre {
    protected void metodoProtegido() {
        System.out.println("Este es un método protegido.");
    }
}

// Clase Hija que extiende ClasePadre
class ClaseHija extends ClasePadre {
    public void usarMetodoProtegido() {
        // Se puede llamar porque es una subclase
        metodoProtegido();  // Funciona sin problemas
    }
}

// Clase principal para probar
public class main {
    public static void main(String[] args) {
        ClaseHija hija = new ClaseHija();
        hija.usarMetodoProtegido();  // Esto imprime "Este es un método protegido."
        
        ClasePadre padre = new ClasePadre();
        // padre.metodoProtegido(); // ERROR: No se puede llamar desde aquí porque no es una subclase ni está en el mismo paquete
    }
}




