/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas.FigurasdosD;
import com.mycompany.figurasgeometricas.Comportamiento;
/**
 * @author Julian David Arias
 *Clase padre de las figuras 2d que implementa los metodos de comportamiento 
 */
public abstract class Figurados implements Comportamiento{
    /**
     * Metodo propio de la clase 
     * @return un double en el metodo perimetro
     */
    public abstract double perimetro();
}
