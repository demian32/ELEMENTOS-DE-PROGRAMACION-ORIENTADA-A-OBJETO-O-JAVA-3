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
public class Probarregistro {
    public static void main(String[] args) {
        Perro p=new Perro();
        p.setNombre("kukis");
        Persona a=new Persona();
        a.setPerro(p);
        //el siguiente es lo0 que resivira el cliente en el paso 4
        System.out.println(a.getPerro().getNombre());
    }
    
}
