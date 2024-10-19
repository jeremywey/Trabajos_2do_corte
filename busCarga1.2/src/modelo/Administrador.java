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
public class Administrador extends Usuario {
    private List<Ruta> rutasAsignadas;

    public Administrador(String nombre, String apellido, String identificacion, String email, String password, String telefono, String direccion) {
        super(nombre, apellido, identificacion, email, password, telefono, direccion);
    }

    public List<Ruta> getRutasAsignadas() {
        return rutasAsignadas;
    }

    public void setRutasAsignadas(List<Ruta> rutasAsignadas) {
        this.rutasAsignadas = rutasAsignadas;
    }





   
    
}
