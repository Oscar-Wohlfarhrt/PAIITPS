/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP2Part2.Models;

import java.util.*;

/**
 *
 * @author Oscar2
 */
public class Movimiento {
    Integer id;
    Date fecha;
    Area fromArea;
    Area toArea;
    
    public Movimiento(Integer id, Area from, Area to, Date fecha){
        fromArea=from;
        toArea=to;
        this.id = id;
        this.fecha=fecha;
    }

    public Date getFecha() {
        return fecha;
    }
    
    @Override
    public String toString()
    {
        return String.format("moved from: \"%s\" to \"%s\" on %s", fromArea,toArea,fecha);
    }
    
}
