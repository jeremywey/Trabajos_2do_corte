/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author jerem
 */

abstract class Instrumento{
    public abstract void tocar();
}

interface Afinable{
    void afinar();
}

class Guitarra extends Instrumento implements Afinable {
    @Override
    
    public void tocar(){
        System.out.println("La guitarra suena ");
    }
    
    @Override
    public void afinar(){
        System.out.println("La guitarra se esta afinando");
    }
} 









public class main {
    public static void main(String[] args) {
        
        Instrumento guitar = new Guitarra();
        guitar.tocar();
    }
}
