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
public class Industrial extends Electricidad implements GenericEntity {
    @TableHeader(name = "Temp Max",columnSize = 150)
    private Double temperaturaMinima;
    @TableHeader(name = "Temp Min",columnSize = 150)
    private Double temperaturaMaxima;

    public Double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public Double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMaxima(Double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void setTemperaturaMinima(Double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
    
}
