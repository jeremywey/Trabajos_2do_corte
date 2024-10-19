/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author jerem
 */
// Clase Procesador
class Procesador {
    public void ejecutarInstrucciones() {
        System.out.println("El procesador está ejecutando instrucciones.");
    }
}

// Clase Computadora que controla la vida de Procesador (composición)
class Computadora {
    private Procesador procesador;

    public Computadora() {
        // Computadora crea y controla el ciclo de vida de Procesador
        this.procesador = new Procesador();
    }

    public void usarComputadora() {
        procesador.ejecutarInstrucciones();
        System.out.println("La computadora está en uso.");
    }
}

// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Computadora
        Computadora miComputadora = new Computadora();
        
        // Usar la computadora, que a su vez usa el procesador
        miComputadora.usarComputadora();
    }
}












