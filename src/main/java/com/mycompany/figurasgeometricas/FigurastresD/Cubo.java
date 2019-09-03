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
public class Cubo extends Figuratres{
     private double arista;
    private double area;
    private double volumen;
/**
 * Costructor de la clase que iniciliza la variable 
 * @param arista guarda el lado que el usuario digite 
 */
    public Cubo(double arista) {
        this.arista = arista;
    }
/**
 * Costructor de la clase que invoca el metodo pedir
 */
    public Cubo() {
        pedir();
    }
    
/**
 * Metodo que calcula el volumen del cubo
 * @return el valor del volumen
 */
    @Override
    public double volumen() {
    volumen = Math.pow(arista, 3);
       
        return volumen;
    }
/**
 * Metodo que calcula el area del cubo
 * @return el valor del area 
 */
    @Override
    public double area() {
     area = 6 * Math.pow(arista, 2);
        return area;
    }
/**
 * Metodo que imprime el volumen y el area del cubo
 */
    @Override
    public void imprimir() {
      System.out.println("___CUBO___");
        System.out.println("Volumen: "+volumen());
        System.out.println("Area: "+area());
    }
/**
 * Metodo que pide los datos del cubo
 */
    @Override
    public void pedir() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite la longitud de la arista:");
        arista = entrada.nextDouble();
    }
    
}
