/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_jafethou;

import java.util.Scanner;
/**
 *
 * @author zenot
 */
public class Lab2P1_JafetHou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        boolean seguir=true;
        while (seguir){
    
        System.out.println ("Menu ");
        System.out.println ("1. Clasificando numeros par, impar, primo ");
        System.out.println ("2. Aproximando Pi ");
        System.out.println ("3. MCD ");
        System.out.println ("Ingrese su opcion: ");
        int opcion = 0;
        opcion = leer.nextInt();
        
        
            switch (opcion){
                case 1:
                    
                     System.out.println ("Ingrese un numero: ");
                     int prim = leer.nextInt();
                     int par = 1;
                     int impar = 0;
                     boolean primo;
                     boolean pares;
                     boolean dos;
                
                     if (prim > 0){ 
                             
                        while (par<=prim){
                             
                            if (prim % par == 0){
                                impar = impar + 1;
                            }    
                            par = par + 1;
                        }
                        if (impar == 2){
                            primo = true;
                        }
                        else {
                            primo = false;
                        }
                        if(prim % 2 == 0){
                            pares = true;
                        }
                        else {
                            pares = false;
                        }
                        if (prim % prim == 0){
                            dos = true;
                        }
                        else {
                            dos = false;
                        }
                        if (primo == true && pares == false){
                            System.out.println ("El numero ingresado es Primo e Impar. ");
                        }
                        
                            if (pares == false && primo == false){
                                System.out.println ("El numero ingresado es Impar. ");
                            
                            }
                            
                            if (pares == true && prim != 2){
                                System.out.println ("El numero ingresado es Par. ");
                            }
                            if (prim == 2){
                                System.out.println ("El numero ingresado es Par y Primo. ");
                            }    

                            
                     }
                            break;   
                case 2:
                    
                    System.out.println ("Ingrese el valor de n: ");
                    int n = leer.nextInt();
                    double i = 1;
                    double multi = 1;
                    
                    while ((i<=n) && (n > 0)){
                        double auxiliar=(4*(i*i))-1;
                        double fraccion= 4*(i*i)/(auxiliar);
                        multi = multi*fraccion;
                        i++;
                    }
                    System.out.println ("PI: "+multi*2);
                    break;
                    
                case 3:
                    
                    System.out.println ("Ingrese el primer numero entero mayor que cero: ");
                    int num1 = leer.nextInt();
                    System.out.println ("Ingrese el segundo numero entero mayor que cero: ");
                    int num2 = leer.nextInt();
                    int numero1 = num1;
                    int numero2 = num2;
                    while  ((num1 != num2) && (num2>0) &&  (num1>0)) {
                        if (num1>num2){
                            num1= num1-num2;
                        }
                        else {
                            num2= num2-num1;
                        }       
                    }
                    if (num2<0){
                        System.out.println ("El numero ingresado debe ser mayor que cero: ");
                    }
                    else;
                       if  (num1<0){
                           System.out.println ("El numero ingresado debe ser mayor que cero: ");
                       }
                        else{
                            System.out.println ("El MCD de "+ numero1 +" y " + numero2 +" es: " + num1);
                    }
            }
        }     
                
    }
        
}
        

    

