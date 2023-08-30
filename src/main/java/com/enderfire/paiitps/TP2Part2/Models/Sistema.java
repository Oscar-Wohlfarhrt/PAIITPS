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
public class Sistema {
    List<Area> areas = new ArrayList<>();
    
    public void moverDocumento(Documento doc, Area dest, Date fecha){
        doc.moveTo(dest, fecha);
    }
    
    public List<Movimiento> getMovimientos(Date fecha){
        return areas.stream().flatMap((a)->a.getDocumentsList()
                .stream().flatMap((d)->d.getMovesList().stream()))
                .filter((m)->m.getFecha().equals(fecha)).toList();
    }
}
