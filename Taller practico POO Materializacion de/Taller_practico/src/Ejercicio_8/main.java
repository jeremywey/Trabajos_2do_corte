/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerem
 */
// Clase Libro
class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

// Clase Biblioteca que tiene una relación de uno a muchos con Libro
class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>(); // Inicializamos la lista de libros
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro); // Se agrega un libro a la lista
    }

    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}

// Clase principal para probar
public class main {
    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote");
        Libro libro2 = new Libro("Cien Años de Soledad");

        // Agregar los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar los libros en la biblioteca
        biblioteca.mostrarLibros();
    }
}
