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
public class Esfera extends Figuratres{
private double volumen;
private double radio;
private double area;
/**
 * Costructor de la clase que inicializa la variable 
 * @param radio Variable que guarda el radio 
 */
    public Esfera(double radio) {
        this.radio = radio;
    }
/**
 * Costructor de la clase que invoca el metodo pedir
 */
    public Esfera() {
        pedir();
    }    
/**
 * Metosdo que calcula el volmen 
 * @return el valor del volumen
 */
    @Override
    public double volumen() {
            volumen = 4/3 * Math.PI * Math.pow(radio, 3);
        return volumen;
    }
/**
 * Metodo que calcula el area
 * @return el valor del area 
 */
    @Override
    public double area() {
       area = 4*Math.PI * Math.pow(radio, 2);
       return area;
    }
/**
 * Metodo que imprime el valor del area y volumen de la figura
 */
    @Override
    public void imprimir() {
        System.out.println("___ESFERA___");
        System.out.println("Area: " + area());
          System.out.println("Volumen: " + volumen());
    }
/**
 * Metodo que pide los datos de la esfera
 */
    @Override
    public void pedir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el numero del radio: ");
        radio = entrada.nextDouble();
    }
    
}
