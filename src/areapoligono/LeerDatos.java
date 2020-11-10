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
public class LeerDatos {
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        //Declarar e inicializar las variables
        
        int miEntero = 0;
        double miDecimal = 0;
        String miCadena = "";
        
        System.out.println("Ingrese un número entero");
        miEntero = leer .nextInt();
        
        System.out.println("Ingrese un número decimal");
        miDecimal = leer.nextDouble();
        
        System.out.println("Ingrese un texto alternativo");
        miCadena = leer.next();
        
        //Salida de datos
        
        System.out.println("Mi Entero : " +miEntero);
        System.out.println("Mi decimal : " +miDecimal);
        System.out.println("Mi cadena : " +miCadena);
        
    }
        
}
    
