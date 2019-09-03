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
public class Triangulo extends Figurados{
    private double lado1, lado2, lado3;
    private double area;
    private double perimetro;
    /**
     * 
     * @param lado1 variable que garda el lado del triangulo
     * @param lado2 variable que garda el lado del triangulo
     * @param lado3 variable que garda el lado del triangulo
     */
    public Triangulo(double lado1,double lado2,double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
/**
 * costructor que invoca el metodo pedir
 */
    public Triangulo() {
    pedir();
    
    }
    /**
     * metodo que calcula el perimetro
     * @return el valor del perimetro 
     */
    @Override
    public double perimetro() {
        perimetro = lado1+lado2+lado3;
        return perimetro;
    }
/**
 * metodo que calcula el area 
 * @return el valor del area
 */
    @Override
    public double area() {
        double semiPerimetro;
        semiPerimetro = (lado1 + lado2 + lado3)/2;
        area = Math.sqrt(semiPerimetro*(semiPerimetro - lado1)*(semiPerimetro - lado2)*(semiPerimetro - lado3));//formula de Heron
        return area;
    }
/**
 * metodo que imprime area y perimetro
 */
    @Override
    public void imprimir() {
        System.out.println("__TRIANGULO__");
        System.out.println("Area: "+area());
        System.out.println("Perimetro: "+perimetro());
        
    }
/**
 * metodo que pide los datos del triangulo
 */
    @Override
    public void pedir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Lado uno: ");
        lado1 = teclado.nextDouble();
        System.out.println("Lado dos: ");
        lado2 = teclado.nextDouble();
        System.out.println("Lado tres: ");
        lado3 = teclado.nextDouble();
    }
    /**
     * metodo que dice que tipo de triangulo es 
     */
     public void claseTriangulo(){
    if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
        System.out.println("El triangulo es Equilatero");
    }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
        System.out.println("El Triangulo es Escaleno");
    }else 
            System.out.println("El Triangulo es Isoseles");
        
    }
}
