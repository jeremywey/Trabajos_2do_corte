/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author jerem
 */

class Impresora{
    public void imprimiendo(){
        System.out.println("La impresora esta imprimiendo");
    }
}

class documento{
    public void impreso(){

        System.out.println("El documento esta impreso");
        
    }
}



public class main {
    public static void main(String[] args) {
                documento Docx = new documento();
                Docx.impreso();
    }
}
