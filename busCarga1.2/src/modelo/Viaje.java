/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author jerem
 */
public class Viaje {
     private AutoBus autobus;
  private Ruta ruta;
  private Date fechaViaje;
  private String horaSalida;
  private String horaLlegada ;

      // Constructor
    public Viaje(AutoBus autobus, Ruta ruta, Date fechaViaje, String horaSalida, String horaLlegada) {
        this.autobus = autobus;
        this.ruta = ruta;
        this.fechaViaje = fechaViaje;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }
  
  
    public AutoBus getAutobus() {
        return autobus;
    }

    public void setAutobus(AutoBus autobus) {
        this.autobus = autobus;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
  
}
