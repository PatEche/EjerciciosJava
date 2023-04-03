package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaracion e inicilizacion del vector
        int vector[] = new int[4];

//        //Carga manual del vector
//        vector[0]=2;
//        vector[1]=35;
//        vector[2]=48;
//        vector[3]=157;

//        //Recorrido del vector
//        for (int i=0; i<vector.length; i++){
//            System.out.println("Estoy en el indice: " + i);
//            System.out.println("Tengo guardado un: " + vector[i]);
//            System.out.println("----------------------");
//        }

            //Carga del vector por teclado
            Scanner scanner = new Scanner(System.in);
            for (int i=0; i< vector.length; i++){
                System.out.println("Ingrese el valor para el indice " + i);
                vector[i] = scanner.nextInt();
            }

        //Recorrido del vector
        for (int i=0; i<vector.length; i++){
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un: " + vector[i]);
            System.out.println("----------------------");
        }

        //scanner.close();
    }
}