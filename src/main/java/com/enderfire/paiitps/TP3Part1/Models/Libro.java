/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP3Part1.Models;

import java.util.*;

/**
 *
 * @author Oscar2
 */
public class Libro {
    String titulo;
    Integer edicion;
    List<Ejemplar> ejemplares = new ArrayList<>();
    Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) throws Exception {
        if(edicion<1900 || edicion>2018)
            throw new Exception("La edicion debe ser un numero entre 1900 y 2018");
        this.edicion = edicion;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String toStringEjemplares(){
        String out="";
        for(Ejemplar e:ejemplares){
            out+=String.format("Ejemplar:\nNro de inventario: %d\n%s\n%s\n\n",e.nroInv,e.prestado?"Prestado":"No prestado",e.sale?"Esta a la venta":"No esta a la venta");
        }
        return out;
    }
    
    @Override
    public String toString(){
        return String.format("Titulo: %s\nEdicion: %d\nAutor: %s",titulo,edicion,autor.toString());
    } 
    
}
