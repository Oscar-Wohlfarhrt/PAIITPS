/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP2Part2.Models;

import java.util.*;
import jdk.jfr.Period;

/**
 *
 * @author Oscar2
 */
public class Area {
    Integer id;
    String nombre;
    String telefono;
    List<Documento> documents = new ArrayList<>();
    
    public Area(Integer id, String name, String tel){
        this.id=id;
        nombre=name;
        telefono=tel;
    }

    public List<Documento> getDocumentsList() {
        return documents;
    }
    
    public void addDoc(Documento doc){
        doc.setCurrentArea(this);
        documents.add(doc);
    }
    
    public Documento getDocumento(int index){
        return documents.get(index);
    }
    
    public void delDocumento(int index){
        documents.remove(index);
    }

    public String getTelefono() {
        return telefono;
    }
    @Override
    public String toString()
    {
        return this.nombre;
    }
}
