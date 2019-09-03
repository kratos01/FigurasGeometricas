/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

import com.mycompany.figurasgeometricas.FigurasdosD.Circulo;
import com.mycompany.figurasgeometricas.FigurasdosD.Cuadrado;
import com.mycompany.figurasgeometricas.FigurasdosD.Triangulo;
import com.mycompany.figurasgeometricas.FigurastresD.Cubo;
import com.mycompany.figurasgeometricas.FigurastresD.Esfera;
import com.mycompany.figurasgeometricas.FigurastresD.Piramide;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Julian David Arias
 */
public class Logica {
     
     List <Comportamiento> figuras = new ArrayList<>();
     Scanner teclado = new Scanner(System.in);
     int estado = 0;
     /**
      * Metodo que muestra el menu de inicio al usuario e imprime los metodos de las figuras geometricas
      */
     public void logica(){
        
        while(estado == 0){
            System.out.println("1. Figura 2D   2.Figura 3D");
            
            int opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                   figurasDosd();
                    break;
                case 2:
                    figurasTresd();
                    break;
            }
        }
        
        for(Comportamiento a : figuras){
            a.imprimir();
             if(a instanceof Triangulo) {
                ((Triangulo)a).claseTriangulo();
             }else if(a instanceof Cuadrado){
                ((Cuadrado)a).claseCuadrado();
             }
        }        
    }
     /**
      * Metodo que muestra al usuario el menu de las figuras en 2d
      * y los añade a una lista 
      */
     public void figurasDosd(){
          System.out.println("1.Circulo  2.Triangulo  3.Cuadrado");
                    int opcion2 = teclado.nextInt();
                    switch(opcion2){
                        case 1:
                            Circulo circulo = new Circulo();
                            figuras.add(circulo);
                            System.out.println("Quiere otra figura?  0.Si  1.No");
                            estado = teclado.nextInt();
                            break;
                        case 2:
                            Triangulo triangulo = new Triangulo();
                            figuras.add(triangulo);
                            System.out.println("Quiere otra figura?  0.Si  1.No");
                            estado = teclado.nextInt();
                            break;
                        case 3:
                            Cuadrado cuadrado = new Cuadrado();
                            figuras.add(cuadrado);
                            System.out.println("Quiere otra figura?  0.Si  1.No");
                            estado = teclado.nextInt();
                            break;
                    }
                   
     }
    /**
     * Metodo que muestra al usuario el menu de las fuguras en 3d
     * y las añade a una lista 
     */
     public void figurasTresd(){
         System.out.println("1.Esfera  2.Piramide  3.Cubo");
                    int opcion3 = teclado.nextInt();
                    switch(opcion3){
                        case 1:
                                Esfera esfera = new Esfera();
                                figuras.add(esfera);
                                System.out.println("Quiere otra figura?  0.Si  1.No");
                                estado = teclado.nextInt();
                            break;
                        case 2:
                                Piramide piramide = new Piramide();
                                figuras.add(piramide);
                                System.out.println("Quiere otra figura?  0.Si  1.No");
                                estado = teclado.nextInt();
                            break;
                        case 3:
                                Cubo cubo = new Cubo();
                                figuras.add(cubo);
                                System.out.println("Quiere otra figura?  0.Si  1.No");
                                estado = teclado.nextInt();
                            break;
                    }
     }
}
