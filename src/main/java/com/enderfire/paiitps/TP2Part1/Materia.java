/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP2Part1;

/**
 *
 * @author Oscar2
 */
public class Materia {
    Integer id;
    String name;
    Integer anio;
    
    public Materia(Integer id, String name, Integer anio){
        this.id = id;
        this.name = name;
        this.anio = anio;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
