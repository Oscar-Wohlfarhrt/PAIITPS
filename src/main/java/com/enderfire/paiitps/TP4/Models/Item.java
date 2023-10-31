/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP4.Models;

/**
 *
 * @author Oscar2
 */
public class Item {
    private Articulo articulo;
    private Integer cantidad;

    public Articulo getArticulo() {
        return articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public double calcularMonto(){
        return articulo.getPrecio()*cantidad;
    }
    
    @Override
    public String toString(){
        return String.format("%dx %s", cantidad,articulo.toString());
    }
}
