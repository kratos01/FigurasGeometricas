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
public class Cuadrado extends Figurados{
    private double lado1, lado2;
    private double perimetro;
    private double area;
    /**
     * costructor de la clase que inicializa las variables 
     * @param lado1 guarda el lado que el usuario digita
     * @param lado2 guarda el lado que el usuario digita
     */
    public Cuadrado(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;       
    }
/**
 * Costructor de la clase que invoca al metodo pedir 
 */
    public Cuadrado() {
        pedir();
    }
/**
 * Metodo que calcula el perimetro del cuadrado
 * @return el valor del perimetro
 */
    @Override
    public double perimetro() {
        perimetro = (lado1*2)+(lado2*2);
        return perimetro;
    }
/**
 * Metodo que calcula el area del cuadrado
 * @return el valor del area
 */
    @Override
    public double area() {
        area = lado1*lado2;
        return area;
    }
/**
 * Metodo que imprime el area y el perimetro del cuadrado 
 */
    @Override
    public void imprimir() {
        System.out.println("___CUADRADO___");
        System.out.println("Perimetro: "+perimetro());
        System.out.println("Area: "+area());
    }
/**
 * Metodo que pide los datos del cuadrado
 */
    @Override
    public void pedir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Lado uno: ");
        lado1 = teclado.nextDouble();
        System.out.println("Lado dos: ");
        lado2 = teclado.nextDouble();
    }
    /**
     * Metodo que imprime cual de que tipo es
     */
    public void claseCuadrado(){
        if(lado1 == lado2){
            System.out.println("Es un Cuadrado");
        }else
            System.out.println("Es un Rectangulo ");
    }
 
}
