/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author jerem
 */
// Clase Vehiculo 
class Vehiculo { 
public void mover() {
System.out.println("El vehículo se mueve."); }
}
// Clase Moto que sobrescribe mover class Moto extends Vehiculo {
class avion extends Vehiculo{
@Override
public void mover(){
    System.out.println("El avion vuela");
}
}


public class main {
    public static void main(String[] args) {
        Vehiculo a = new avion();
        a.mover();
    }
}
