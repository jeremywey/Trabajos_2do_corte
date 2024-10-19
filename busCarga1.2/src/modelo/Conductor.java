/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jerem
 */
public class Conductor extends Usuario {
     private AutoBus autobusAsignado;

    public Conductor(String nombre, String apellido, String identificacion, String email, String password, String telefono, String direccion) {
        super(nombre, apellido, identificacion, email, password, telefono, direccion);
    }

    public AutoBus getAutobusAsignado() {
        return autobusAsignado;
    }

    public void setAutobusAsignado(AutoBus autobusAsignado) {
        this.autobusAsignado = autobusAsignado;
    }
     
}
