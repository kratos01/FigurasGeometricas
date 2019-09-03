/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas.FigurastresD;

import java.util.Scanner;

/**
 *
 * @author Julian David Arias
 */
public class Piramide extends Figuratres {
 private double lado;
    private double apotema;
    private double areaTotal;
    private double areaBase;
    private double volumen;
/**
 * Costructor de la clase que inicializa las variables de la piramide
 * @param lado
 * @param apotema 
 */
    public Piramide(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
/**
 * ostructor de la clase que invoca el metodo pedir
 */
    public Piramide() {
        pedir();
    }
    
    /**
     * Metodo que calcula el volumen de la piramide 
     * @return el valor del volumen
     */
    @Override
    public double volumen() {
       volumen = (areaBase * apotema) / 3;
    return volumen;
    }
/**
 * Metodo que calcula el area de la piramide
 * @return el valor del area
 */
    @Override
    public double area() {
     double areaL;
        double perimetroBase;
         perimetroBase = 4 * lado;
         areaL = (perimetroBase * apotema) / 2;
         
         areaBase = lado * lado;
        
         areaTotal = areaL + areaBase;
        
        return areaTotal;
    }
/**
 * Metodo que imprime el area y el volumen 
 */
    @Override
    public void imprimir() {
        System.out.println("___PIRAMIDE___");
        System.out.println("Area: " + area());
        System.out.println("Volumen: " + volumen());
    }
/**
 * Metodo que pide los datos de la piramide
 */
    @Override
    public void pedir() {
        Scanner teclado = new Scanner(System.in);
     System.out.println("digite el valor del lado: ");
        lado = teclado.nextDouble();
        System.out.println("digite el valor del apotema: ");
        apotema = teclado.nextDouble();
    }
    
}
