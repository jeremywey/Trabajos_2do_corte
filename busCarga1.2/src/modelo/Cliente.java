/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author jerem
 */
public class Cliente extends Usuario {
    private List<Boleto> boletosComprados;

    public Cliente(String nombre, String apellido, String identificacion, String email, String password, String telefono, String direccion) {
        super(nombre, apellido, identificacion, email, password, telefono, direccion);
    }

    public List<Boleto> getBoletosComprados() {
        return boletosComprados;
    }

    public void setBoletosComprados(List<Boleto> boletosComprados) {
        this.boletosComprados = boletosComprados;
    }
    
}
