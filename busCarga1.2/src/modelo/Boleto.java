/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jerem
 */
public class Boleto {
   private String numeroBoleto;
    private Usuario usuario;
    private AutoBus autobus;
    private Ruta ruta;
    private int asiento;
    private double precio;
    private Date fechaCompra; 
    
      public Boleto(String numeroBoleto, Usuario usuario, AutoBus autobus, Ruta ruta, int asiento, double precio, Date fechaCompra) {
        this.numeroBoleto = numeroBoleto;
        this.usuario = usuario;
        this.autobus = autobus;
        this.ruta = ruta;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
    }
    
    

    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
}