/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculette;

import java.util.Scanner;

/**
 *
 * BOREE Léo TDC 20/09/2024
 */
public class Calculette {

    public static void main(String[] args) {
       int nb;

       int operateur;

       int first;

       int second;

       int result;

    //nb=5;

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the operator:\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
    nb=sc.nextInt(); // On demande a sc de donner le prochain entier
    operateur = nb;

    if (operateur > 5){
            System.out.println("erreur");

 
        }
    if (operateur <=0){

          System.out.println("erreur");

       }

    System.out.println("Please enter the first number:");
    first=sc.nextInt();
    System.out.println("Please enter the second number:");
    second=sc.nextInt();
    
    if (operateur == 1){
            result = first+second;
            System.out.println("The result is :"+result+"");

        }
    if (operateur == 2){

            result = first-second;
           System.out.println("The result is :"+result+"");

        }
 
    if (operateur == 3){
            result = first*second;
            System.out.println("The result is :"+result+"");

    }

    if (operateur == 4){
            result = first/second;
            System.out.println("The result is :"+result+"");

        }
    if (operateur == 5){
            result = first%second;
            System.out.println("The result is :"+result+"");

        }
        }
    }

 