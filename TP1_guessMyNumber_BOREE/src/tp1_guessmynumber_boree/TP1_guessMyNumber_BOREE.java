/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_boree;

import java.util.Random;
import java.util.Scanner;

/**
 * TP1 BOREE Léo 23/09/2024
 *
 * @author leoboree
 */
public class TP1_guessMyNumber_BOREE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int a = generateurAleat.nextInt(100);
        int b = generateurAleat.nextInt(100);
        int c = generateurAleat.nextInt(100);
        int d = generateurAleat.nextInt(100);
        int e = generateurAleat.nextInt(100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int choix;

        System.out.println("Veuiller choisir une mode de dificulter");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Nifficile");
        System.out.println("3) Cauchemar");

        choix = sc.nextInt();

        if (choix == 1) {
            int nbralea = generateurAleat.nextInt(50);
            int saisie;
            int tentatives = 0;
            
            System.out.println("Saisir un nombre entre 0 et 50 :");
            while (true) {
                saisie = sc.nextInt();
                tentatives = tentatives + 1;
                if (nbralea == saisie) {
                    System.out.println("Gagné en " + tentatives + " tentatives !");
                    break;
                }
                if (nbralea < saisie) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                }
            }
        }
        if (choix == 2) {
            int nbalea = generateurAleat.nextInt(100);
            int saisie;
            int tentatives = 0;
            System.out.println("Saisir un nombre entre 0 et 100 :");
            while (true) {
                saisie = sc.nextInt();
                tentatives = tentatives + 1;
                if (nbalea == saisie) {
                    System.out.println("Gagné en " + tentatives + " tentatives !");
                    break;
                }
                if (nbalea < saisie) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                }
            }
        }
        if (choix == 3) {
            int nbalea = generateurAleat.nextInt(300);
            int saisie;
            int tentatives = 0;
            System.out.println("Saisir un nombre entre 0 et 300 :");
            while (true) {
                saisie = sc.nextInt();
                tentatives = tentatives + 1;
                if (nbalea == saisie) {
                    System.out.println("Gagné en " + tentatives + " tentatives !");
                    break;
                }
                if (nbalea < saisie) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                    if (tentatives >= 10) {
                        System.out.println("perdu !!! vous avez depasser les  " + tentatives + " tentatives !");
                        break;
                    }
                }
            }
        }
        if (choix == 4) {
            int nbralea = generateurAleat.nextInt(100);
            int saisie;
            int tentatives = 0;
            System.out.println("Saisir un nombre entre 0 et 100 :");
            while (true) {
                saisie = sc.nextInt();
                tentatives = tentatives + 1;
                if (nbralea == saisie) {
                    System.out.println("Gagné en " + tentatives + " tentatives !");
                    break;
                }
                // 30% de chances de donner une mauvaise indication
                boolean mauvaiseIndication = generateurAleat.nextInt(100) < 30;
                if (mauvaiseIndication) {
                    // Donner la mauvaise indication
                    if (nbralea < saisie) {
                        System.out.println("Trop petit !");  // Mauvaise indication
                    } else {
                        System.out.println("Trop grand !");  // Mauvaise indication
                    }
                } else {
                    // Donner la bonne indication
                    if (nbralea < saisie) {
                        System.out.println("Trop grand !");
                    } else {
                        System.out.println("Trop petit !");
                    }
                }
            }
        }
    }

}
