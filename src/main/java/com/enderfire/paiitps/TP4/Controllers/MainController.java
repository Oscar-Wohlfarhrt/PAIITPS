/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP4.Controllers;

import com.enderfire.paiitps.TP4.Models.*;
import com.enderfire.paiitps.Utils.GenericEntity;
import java.util.*;

/**
 *
 * @author Oscar2
 */
public class MainController {
    public static MainController mc = new MainController();
    
    private List<Articulo> articulos = new ArrayList<>();
    private List<Factura> facturas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    
    public MainController(){
        Cliente cli = new Cliente();
        cli.setNombre("Cliente 1");
        cli.setApellido("Apellido 1");
        cli.setDni("123456");
        cli.setTelefono("555-123-1234");
        cli.setDireccion("Direccion 1");
        clientes.add(cli);
        cli = new Cliente();
        cli.setNombre("Cliente 2");
        cli.setApellido("Apellido 2");
        cli.setDni("123457");
        cli.setTelefono("555-123-1235");
        cli.setDireccion("Direccion 2");
        clientes.add(cli);
        
        Herramientas her = new Herramientas();
        her.setNombre("Herramienta 1");
        her.setPrecio(50.0);
        her.setDescripcion("Es una herramienta");
        addArticulo(her);
        her = new Herramientas();
        her.setNombre("Herramienta 2");
        her.setPrecio(100.0);
        her.setDescripcion("Es una herramienta");
        addArticulo(her);
        
        Industrial ind = new Industrial();
        ind.setNombre("Industrial 1");
        ind.setPrecio(100.0);
        ind.setPotenciaMaxima(10000.0);
        ind.setTemperaturaMinima(-40.0);
        ind.setTemperaturaMaxima(100.0);
        addArticulo(ind);
        ind = new Industrial();
        ind.setNombre("Industrial 2");
        ind.setPrecio(200.0);
        ind.setPotenciaMaxima(20000.0);
        ind.setTemperaturaMinima(-50.0);
        ind.setTemperaturaMaxima(120.0);
        addArticulo(ind);
        
        Domiciliaria dom = new Domiciliaria();
        dom.setNombre("Domiciliaria 1");
        dom.setPrecio(50.0);
        dom.setPotenciaMaxima(2000.0);
        addArticulo(dom);
        dom = new Domiciliaria();
        dom.setNombre("Domiciliaria 2");
        dom.setPrecio(70.0);
        dom.setPotenciaMaxima(4000.0);
        addArticulo(dom);
    }
    
    public void addArticulo(Articulo art){
        articulos.add(art);
    }
    public void delArticulo(Articulo art){
        articulos.remove(art);
    }
    public List<Articulo> getArticulos(){
        return articulos;
    }
    public List<Cliente> getClientes(){
        return clientes;
    }
    public List<Factura> getFacturas(){
        return facturas;
    }
    public void addFactura(Factura fac){
        facturas.add(fac);
    }
    public List<Domiciliaria> getElectricidadDomiciliaria(){
        return articulos.stream().filter((a)->(a instanceof Domiciliaria)).map((a)->(Domiciliaria)a).toList();
    }
    public List<Industrial> getElectricidadIndustrial(){
        return articulos.stream().filter((a)->(a instanceof Industrial)).map((a)->(Industrial)a).toList();
    }
    public List<Herramientas> getHerramientas(){
        return articulos.stream().filter((a)->(a instanceof Herramientas)).map((a)->(Herramientas)a).toList();
    }
    
    
}
