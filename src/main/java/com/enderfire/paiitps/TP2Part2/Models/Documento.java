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
public class Documento {
    Integer id;
    Date fechaCreacion;
    Area currentArea;
    List<Movimiento> moves = new ArrayList<>();

    public void setCurrentArea(Area currentArea) {
        this.currentArea = currentArea;
    }
    
    public Area getCurrentArea() {
        return currentArea;
    }
    
    public List<Movimiento> getMovesList(){
        return moves;
    }
    
    public void moveTo(Area area,Date fecha){
        moves.add(new Movimiento(moves.size(),currentArea,area,fecha));
    }
}
