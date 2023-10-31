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
public class Electricidad extends Articulo implements GenericEntity {
    @TableHeader(name = "Pot. Maxima", columnSize = 150)
    private Double potenciaMaxima;

    public void setPotenciaMaxima(Double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public Double getPotenciaMaxima() {
        return potenciaMaxima;
    }
    
}
