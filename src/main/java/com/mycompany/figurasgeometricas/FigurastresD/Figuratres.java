/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas.FigurastresD;

import com.mycompany.figurasgeometricas.Comportamiento;

/**
 *
 * @author Julian David Arias
 * Clase padre de las figuras 3d que implementa los metodos de la interfaz 
 */
public abstract class Figuratres implements Comportamiento{
    /**
     * Metodo abstracto de la clase ´padre 
     * @return un duble en el metodo volmen 
     */
    public abstract double volumen();
}
