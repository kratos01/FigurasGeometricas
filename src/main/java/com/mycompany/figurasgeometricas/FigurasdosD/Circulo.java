/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas.FigurasdosD;

import java.util.Scanner;

/**
 *
 * @author Julian David Arias
 */
public class Circulo extends Figurados{
    private double radio;
    private double perimetro;
    private double area;
/**
 * Costructor de la clase que invoca el metodo pedir
 */
    public Circulo(){
        pedir();
    }
    /**
     * Metodo que calcula el perimetro del circlo
     * @return el valor del perimetro
     */
    @Override
    public double perimetro() {
        perimetro = 2*Math.PI*radio;
        return perimetro;
    }
/**
 * Metodo que calcula el area del circulo
 * @return el valor del area 
 */
    @Override
    public double area() {
        area = Math.PI*Math.pow(radio,2);
        return area;
    }
/**
 * Metodo que imprime el area y el perimetro del circulo
 */
    @Override
    public void imprimir() {
        System.out.println("___CIRCULO___");
        System.out.println("Perimetro: "+perimetro());
        System.out.println("Area: "+area());
    }
/**
 * Metodo que pide los datos del circulo
 */
    @Override
    public void pedir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Radio: ");
        radio = teclado.nextDouble();
    }

}
