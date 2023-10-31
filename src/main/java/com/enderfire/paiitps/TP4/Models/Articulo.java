/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP4.Models;

import com.enderfire.paiitps.Utils.GenericEntity;
import com.enderfire.paiitps.Utils.TableHeader;

/**
 *
 * @author Oscar2
 */
public class Articulo implements GenericEntity{
    @TableHeader(name = "Nombre",columnSize = 150)
    private String nombre;
    @TableHeader(name = "Precio",columnSize = 150)
    private Double precio;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString(){
        return String.format("%s [$%.2f]", nombre,precio);
    }
}
