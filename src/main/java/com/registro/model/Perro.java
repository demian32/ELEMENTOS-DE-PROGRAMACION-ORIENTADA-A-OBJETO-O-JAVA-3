/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.registro.model;

/**
 *
 * @author T107
 */
public class Perro {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String ObtenerRegistro(){
        return "Ele Perrito que registrarte es: "+nombre;
    }
    
}
