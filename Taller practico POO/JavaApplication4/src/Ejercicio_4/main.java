/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author jerem
 */
class gato {
    protected String sonido = "Sonido de animal";
    public void hacerSonido() {
            System.out.println("sonido");
}
}

class animal extends gato {
    public animal(){
        super.sonido = "miau";
    }
    
    @Override
    
    public void hacerSonido (){
        super.hacerSonido();
        System.out.println("  El gato esta maulleando ");
    }
    
}








public class main {
    public static void main(String[] args) {
        
    }
}
