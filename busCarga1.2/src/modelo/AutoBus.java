/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jerem
 */
public class AutoBus {
  private String numeroBus;
  private int capacidad;
  private GPS ubicacionActual;
  private Ruta rutaAsignada;
  private String estado;  
  
   public AutoBus(String numeroBus, int capacidad, GPS ubicacionActual, Ruta rutaAsignada, String estado) {
        this.numeroBus = numeroBus;
        this.capacidad = capacidad;
        this.ubicacionActual = ubicacionActual;
        this.rutaAsignada = rutaAsignada;
        this.estado = estado;
    }
  
  

    public String getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(String numeroBus) {
        this.numeroBus = numeroBus;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public GPS getUbicacionActual() {
        return ubicacionActual;
    }

    public void setUbicacionActual(GPS ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public Ruta getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(Ruta rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
}
