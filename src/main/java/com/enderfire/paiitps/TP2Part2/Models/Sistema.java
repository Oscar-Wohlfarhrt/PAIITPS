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
    private static List<Area> areas = new ArrayList<>();
    
    public static void crearArea(String name, String tel){
        areas.add(new Area(areas.size(),name,tel));
    }
    public static void delArea(int index){
        areas.remove(index);
    }
    public static List<Area> getAreas(){
        return areas;
    }
    
    public static List<String> getStringAreas(){
        return areas.stream().map((a)->a.nombre).toList();
    }
    
    public static Area getArea(Integer index){
        return areas.get(index);
    }
    
    public static void moverDocumento(Documento doc, Area dest, Date fecha){
        doc.moveTo(dest, fecha);
    }
    
    public static List<Movimiento> getMovimientos(Date fecha){
        return areas.stream().flatMap((a)->a.getDocumentsList()
                .stream().flatMap((d)->d.getMovesList().stream()))
                .filter((m)->m.getFecha().equals(fecha)).toList();
    }
}
