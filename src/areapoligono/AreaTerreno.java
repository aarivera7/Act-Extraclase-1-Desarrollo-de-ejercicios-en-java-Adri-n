/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligono;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class AreaTerreno {
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
       // Declaración e inialización de variables
       
       double A, B, C, D, at, ar, area;
       
       A = 0; B = 0; C = 0; D = 0; at = 0; ar = 0; area = 0;
       
       System.out.println("***Programa que permite el cálculo de un terreno***");
       
       System.out.println("");
       
       //Lectura de datos
       
       System.out.println("Ingrese el lado A del terreno");
       A = leer.nextDouble();
       
       System.out.println("Ingrese el lado B del terreno");
       B = leer.nextDouble();
       
       System.out.println("Ingrese el lado C del terreno");
       C = leer.nextDouble();
       
       //Proceso
       D = A - C;
       at = (B * D) / 2;
       ar = B * C;
       area = at + ar;
       
       //Salida
       System.out.println("El área del terreno es: " +area);
    }
    
}
