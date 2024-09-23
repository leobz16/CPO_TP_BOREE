/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_boree;

import java.util.Scanner;

/** TP1 BOREE Léo 23/09/2024
 *
 * @author leoboree
 */
public class TP1_manipNombresint_BOREE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);

       // initialisation de toutes les variables du code
       int nb1;
       int nb2;
       int somme;
       int produit;
       int differance;
       int division;
       int divisionmod;
       //demande des saisie des 2 nombre

       System.out.println("saisir 2 nombre ");
       nb1=sc.nextInt();
       nb2=sc.nextInt();
       
        System.out.println("le premier nombre est "+nb1+" et le second est "+nb2);

        // clacule de la somme, du produit et de la differance
        somme = nb1+nb2;
        produit = nb1*nb2;
        differance = nb1-nb2;

        System.out.println("la somme de ses deux nombre est : "+somme);
        System.out.println("le produit de ses deux nombre est : "+produit);
        System.out.println("la differance de ses deux nombre est : "+differance);
         // clacule de la division euclidiene

        division = nb1/nb2;
        divisionmod = nb1%nb2;
        System.out.println("le quotient entier de la division euclidienne est : "+division+" est sont reste est :"+divisionmod);

    }
}
   