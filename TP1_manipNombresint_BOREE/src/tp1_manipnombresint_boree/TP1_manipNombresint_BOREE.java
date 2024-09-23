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
       int nbre1;
       int nbre2;
       int somme;
       int produit;
       int difference;
       int division;
       int divisionmod;
       //demande des saisie des 2 nombre

       System.out.println("saisir 2 nombre ");
       nbre1=sc.nextInt();
       nbre2=sc.nextInt();
       
        System.out.println("le premier nombre est "+nbre1+" et le second est "+nbre2);

        // clacule de la somme, du produit et de la differance
        somme = nbre1+nbre2;
        produit = nbre1*nbre2;
        difference = nbre2-nbre1;

        System.out.println("la somme de ses deux nombre est : "+somme);
        System.out.println("le produit de ses deux nombre est : "+produit);
        System.out.println("la differance de ses deux nombre est : "+difference);
         // clacule de la division euclidiene

        division = nbre1/nbre2;
        divisionmod = nbre1%nbre2;
        System.out.println("le quotient entier de la division euclidienne est : "+division+" est sont reste est :"+divisionmod);

    }
}
   