package lab3p1_jafethou;

import java.util.Scanner;

public class Lab3P1_JafetHou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resp = 1;
        while (resp != 4) {
            System.out.println("1. Serie Euclidiana ");
            System.out.println("2. Pokebola ");
            System.out.println("3. OK Boomer ");
            System.out.println("Ingrese su opcion: ");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuantos puntos ingresara: ");
                    int puntos = leer.nextInt();
                    double total = 1;
                    int i = 1;
                    double distancia = 0;
                    if (puntos > 0) {
                        for (i = 1; i <= puntos; i++) {

                            System.out.println("Ingrese el valor de X: ");
                            double x = leer.nextInt();
                            System.out.println("Ingrese el valor de Y: ");
                            double y = leer.nextInt();
                            distancia = (Math.pow(x - y, 2)) + distancia;
                        }
                        total = Math.sqrt(distancia);
                        System.out.println("La distancia euclidiana es:  " + total);
                    } else {
                        System.out.println("Ingrese un numero positivo mayor a 0 ");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el tamano de la pokebola: ");
                    int n = leer.nextInt();
                    if (n % 2 != 0){
                        for (int a = 1; a <= n / 2 - 1; a++) {
                            for (int f = 1; f <= n * 2 - 1; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }//primeras lineas

                        for (int a = 1; a<=1 ; a++){
                            for (int f = 1; f <= n/3+2 ; f++) {
                                System.out.print("*");
                            }
                            for (int f = 1; f <= n/2+2 ; f++) {
                                System.out.print("#");
                            }
                            for (int f = 1; f <= n/3+2 ; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// primera linea del hashtag

                        for (int a = 1; a<=1 ; a++){
                            for (int f = 1; f <= 1 ; f++) {
                                System.out.print("*");
                            }
                            for (int f = 1; f <= n/2 ; f++) {
                                System.out.print("#");
                            }
                            for (int f = 1; f <= n/2+2 ; f++) {
                                System.out.print(" ");
                            }
                            for (int f = 1; f <= n/2 ; f++) {
                                System.out.print("#");
                            }
                            for (int f = 1; f <= 1 ; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// Mitad de la pokebola

                        for (int a = 1; a<=1 ; a++){
                            for (int f = 1; f <= 1 ; f++) {
                                System.out.print("*");
                            }
                            for (int f = 1; f <= n/2 ; f++) {
                                System.out.print(" ");
                            }
                            for (int f = 1; f <= n/2+2 ; f++) {
                                System.out.print("#");
                            }
                            for (int f = 1; f <= n/2
                                    ; f++) {
                                System.out.print(" ");
                            }
                            for (int f = 1; f <= 1 ; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// tercera linea de los hashtags

                        for (int a = 1; a <= n / 2 - 2; a++) {
                            for (int f = 1; f <= 1; f++) {
                                System.out.print("*");
                            }
                            for (int f = 1; f <= n * 2 - 3; f++) {
                                System.out.print(" ");
                            }
                            for (int f = 1; f <= 1; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// parte vacia de la pokebola, lo que esta abajo con espacios

                        for (int a = 1; a <= 1; a++) {
                            for (int f = 1; f <= n * 2 - 1; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// ultima linea
                   
                    
                    
                    }else if (n % 2 == 0 ){
                        for (int a = 1; a <= n / 2 - 1; a++) {
                            for (int f = 1; f <= n * 2 - 1; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }//primeras lineas
                    
                        for (int a = 1; a<=1 ; a++){
                            for (int f = 1; f <= n/3+3 ; f++) {
                                System.out.print("*");
                            }
                            for (int f = 1; f <= n/2+2 ; f++) {
                                System.out.print("#");
                            }
                            for (int f = 1; f <= n/3+2 ; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// primera linea del hashtag

                        for (int a = 1; a<=1 ; a++){
                            for (int f = 1; f <= 1 ; f++) {
                                System.out.print("*");
                            }
                            for (int f = 1; f <= n/2 ; f++) {
                                System.out.print("#");
                            }
                            for (int f = 1; f <= n/2+2 ; f++) {
                                System.out.print(" ");
                            }
                            for (int f = 1; f <= n/2-1 ; f++) {
                                System.out.print("#");
                            }
                            for (int f = 1; f <= 1 ; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// Mitad de la pokebola

                        for (int a = 1; a<=1 ; a++){
                            for (int f = 1; f <= 1 ; f++) {
                                System.out.print("*");
                            }
                            for (int f = 1; f <= n/2 ; f++) {
                                System.out.print(" ");
                            }
                            for (int f = 1; f <= n/2+2 ; f++) {
                                System.out.print("#");
                            }
                            for (int f = 1; f <= n/2-1
                                    ; f++) {
                                System.out.print(" ");
                            }
                            for (int f = 1; f <= 1 ; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// tercera linea de los hashtags

                        for (int a = 1; a <= n / 2 - 3; a++) {
                            for (int f = 1; f <= 1; f++) {
                                System.out.print("*");
                            }
                            for (int f = 1; f <= n * 2 - 3; f++) {
                                System.out.print(" ");
                            }
                            for (int f = 1; f <= 1; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// parte vacia de la pokebola, lo que esta abajo con espacios

                        for (int a = 1; a <= 1; a++) {
                            for (int f = 1; f <= n * 2 - 1; f++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }// ultima linea
                    }
                       
                    
                    
                    
                            
                    
                    
                    break;
                case 3:
                    System.out.println("Ingrese su agno de nacimiento entre 1946 y 2025 para ver su generacion: ");
                    int agno = leer.nextInt();
                    if (agno >= 1946 && agno <= 2025) {
                        if (agno <= 1959 && agno >= 1946) {
                            System.out.println("Felicidades usted es de la Generacion Baby Boomer Gen! ");
                        } else if (agno >= 1960 && agno <= 1974) {
                            System.out.println("Felicidades usted es de la Generacion X! ");
                        } else if (agno >= 1975 && agno <= 1979) {
                            System.out.println("Felicidades usted es de la Generacion Xennials! ");
                        } else if (agno >= 1980 && agno <= 1989) {
                            System.out.println("Felicidades usted es de la Generacion Millenials! ");
                        } else if (agno >= 1990 && agno <= 2012) {
                            System.out.println("Felicidades usted es de la Generacion Gen Z! ");
                        } else if (agno >= 2013 && agno <= 2025) {
                            System.out.println("Felicidades usted es de la Generacion Gen Alpha! ");
                        }
                    } else {
                        System.out.println("Ingrese una fecha de nacimiento correcta");
                    }
                    break;
                    default:break;       
            }//Fin del switch
            System.out.println("Desea continuar [1/2/3], ingrese 4 para salir: ");
            resp = leer.nextInt();
        }
    }

}
