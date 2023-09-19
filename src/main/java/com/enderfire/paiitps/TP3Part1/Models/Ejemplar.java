/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP3Part1.Models;

/**
 *
 * @author Oscar2
 */
public class Ejemplar {
    Integer nroInv;
    Boolean sale;
    Boolean prestado;

    public void setNroInv(Integer nroInv) {
        this.nroInv = nroInv;
    }

    public Integer getNroInv() {
        return nroInv;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }

    public Boolean getSale() {
        return sale;
    }
    
    
}
