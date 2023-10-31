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
public class Herramientas extends Articulo implements GenericEntity {
    @TableHeader(name = "Descripcion", columnSize = 150)
    private String descripcion;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
