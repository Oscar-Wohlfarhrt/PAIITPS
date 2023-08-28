/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP2Part1;

import java.util.*;

/**
 *
 * @author Oscar2
 */
public class Carrera {
    Integer id;
    String name;
    List<Plan> planes = new ArrayList<>();
    
    public Carrera(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addPlan(Plan mat){
        planes.add(mat);
    }
    
    public Plan getPlan(int index){
        return planes.get(index);
    }
    
    public List<Plan> getMaterias(){
        return planes;
    }
}
