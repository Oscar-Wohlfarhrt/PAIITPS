/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enderfire.paiitps.TP4.Models;

import com.enderfire.paiitps.Utils.GenericEntity;
import com.enderfire.paiitps.Utils.TableHeader;

/**
 *
 * @author Oscar2
 */
public class Cliente implements GenericEntity {
    @TableHeader(name = "DNI",columnSize = 150)
    private String dni;
    @TableHeader(name = "Nombre",columnSize = 150)
    private String nombre;
    @TableHeader(name = "Apellido",columnSize = 150)
    private String apellido;
    @TableHeader(name = "Direccion",columnSize = 150)
    private String direccion;
    @TableHeader(name = "Telefono",columnSize = 150)
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
