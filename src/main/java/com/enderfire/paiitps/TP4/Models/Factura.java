/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP4.Models;

import com.enderfire.paiitps.Utils.GenericEntity;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Oscar2
 */
public class Factura implements GenericEntity {
    private LocalDate fecha;
    private Long nroFactura;
    private Character letra;
    private List<Item> items=new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public Character getLetra() {
        return letra;
    }

    public Long getNroFactura() {
        return nroFactura;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public void setNroFactura(Long nroFactura) {
        this.nroFactura = nroFactura;
    }
    
    public void addItem(Item art){
        items.add(art);
    }
    public void delItem(int index){
        items.remove(index);
    }
    public double informarTotalPagar(){
        double total=0;
        for(Item i:items){
            total+=i.calcularMonto();
        }
        return total;
    }
    @Override
    public String toString(){
        return String.format("%d, %c, %s",nroFactura,letra,fecha.toString());
    }
    
    private String getItemsString(){
        return String.join("<br>", items.stream().map(i->i.toString()).toList());
    }
    
    public String getDetailedString(){
        return String.format("<html>Numero: %d<br>Letra: %c<br>Fecha: %s<br>Total: $%.2f<br><br>Items:<br>%s</html>",nroFactura,letra,fecha.toString(),informarTotalPagar(),getItemsString());
    }
}
