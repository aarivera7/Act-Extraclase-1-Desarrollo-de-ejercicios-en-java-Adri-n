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
public class ConversionMetro {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        
        double M, Ck, Cft, Cp, Cc, R;
        int O;
        
        M=0; Ck=0.001; Cft=3.2808; Cp=39.3701; Cc=100; O=0; R=0;
        
        System.out.println("Programa que permite convertir de metros a kilómetros, pies, pulgadas y centímetros.");
        System.out.println("");
        
        //Entrada, Proceso y Salida de Datos
        
        System.out.println("Elige una opción: \n 1. Para pasar de metros a kilómetros.\n"
                + " 2. Para pasar de metros a pies.\n 3. Para pasar de metros a pulgadas.\n 4. Para pasar de metros a centímetros.\n");
        O = leer.nextInt();
        if(O == 1){
            System.out.println("Ingrese el valor en metros que quiere convertir a kilómetros");
            M = leer.nextDouble();
            R = M*Ck;
            System.out.println("El resultado es: "+R+"km");
        } else {
        if(O == 2){
        System.out.println("Ingrese el valor en metros que quiere convertir a pies");
            M = leer.nextDouble();
            R = M*Cft;
            System.out.println("El resultado es: "+R+"ft");
        } else {
        if(O == 3){
        System.out.println("Ingrese el valor en metros que quiere convertir a pulgadas");
            M = leer.nextDouble();
            R = M*Cp;
            System.out.println("El resultado es: "+R+" pulgadas");
        } else {
        if(O == 4){
        System.out.println("Ingrese el valor en metros que quiere convertir a centímetros");
            M = leer.nextDouble();
            R = M*Cc;
            System.out.println("El resultado es: "+R+"cm");
        } else {
        System.out.println("La opción que elegiste no existe");
        }
        }
        }
        }
        
    }
    
}
