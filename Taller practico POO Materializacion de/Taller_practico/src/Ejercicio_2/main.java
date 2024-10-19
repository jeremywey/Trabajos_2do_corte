/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author jerem
 */

interface Nadador {
    void nadar();
    
}

class delfin implements Nadador{
    @Override
    public void nadar(){
        System.out.println("El delfin esta nadando");
    }
}




public class main {
    public static void main(String[] args) {
        
    }
}
