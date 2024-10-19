/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivatedefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author jerem
 */
public class Ruta {
     private String numeroRuta;
  private List<Parada> paradas;
  private Horario horario;
  private int duracion;
  private double tarifa;
  
   public Ruta(String numeroRuta, List<Parada> paradas, Horario horario, int duracion, double tarifa) {
        this.numeroRuta = numeroRuta;
        this.paradas = paradas;
        this.horario = horario;
        this.duracion = duracion;
        this.tarifa = tarifa;
    }
  
  

    public String getNumeroRuta() {
        return numeroRuta;
    }

    public void setNumeroRuta(String numeroRuta) {
        this.numeroRuta = numeroRuta;
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(List<Parada> paradas) {
        this.paradas = paradas;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
  
  
}
