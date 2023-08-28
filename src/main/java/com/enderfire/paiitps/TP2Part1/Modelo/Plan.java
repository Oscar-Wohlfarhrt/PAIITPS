/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP2Part1.Modelo;

import java.util.*;

/**
 *
 * @author Oscar2
 */
public class Plan {
    Integer id;
    String name;
    Integer anio;
    List<Materia> materias = new ArrayList<>();

    public Plan(Integer id, String name, Integer anio){
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
    
    public void addMateria(Materia mat){
        materias.add(mat);
    }
    
    public Materia getMateria(Integer index){
        return materias.get(index);
    }
    
    public List<Materia> getMaterias(){
        return materias;
    }
    
    @Override
    public String toString(){
        return String.format("Plan: %s [%d] [Año: %d] [Materias: %d]", name,id,anio,materias.size());
    }
}
