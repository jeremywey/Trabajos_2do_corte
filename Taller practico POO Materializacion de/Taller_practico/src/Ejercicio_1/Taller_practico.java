/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author jerem
 */

class Animal {
    public void mover(){
        System.out.println("El animal se esta moviendo");
    }
}


class perro extends Animal {
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
}

public class Taller_practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perraco = new perro();
        perraco.mover();
    }
    
}
