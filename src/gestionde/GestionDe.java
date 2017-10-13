/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import view.Fenetre;
import java.util.Scanner;

/**
 *
 * @author csnd2348
 */
public class GestionDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        De d1 = new De();
//        De d2 = new De();
//        De d3 = new De();
//        
//        d1.lancer();
//        d2.lancer();
//        d3.lancer();
//        
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
        /*System.out.print("Entrez le nombre de joueur : ");
        Scanner sc = new Scanner (System.in);
        int nbjoueur = sc.nextInt();
        
        System.out.print("Entrez le nombre de lancer : ");
        sc = new Scanner (System.in);
        int nblancer = sc.nextInt();
        
        Simulateur sim = new Simulateur(nbjoueur, nblancer);
        
        //Simulateur sim = new Simulateur();
        System.out.println("Après construction");
        System.out.println(sim);
        sim.remplir();
        System.out.println("Après remplissage");
        System.out.println(sim);
        
        System.out.print("Afficher les résultats du joueur : ");
        sc = new Scanner (System.in);
        int resultat = sc.nextInt();
        sim.afficheLancersJoueurs(resultat);
        
        System.out.println("");
        System.out.print("Afficher le total du joueur : ");
        sc = new Scanner (System.in);
        int total = sc.nextInt();
        System.out.println(sim.totalJoueur(total));
        
        System.out.print("Afficher nombre de six joueur : ");
        sc = new Scanner (System.in);
        int nbsix = sc.nextInt();
        System.out.println(sim.nombreSix(nbsix));
        */
        //Jeu421 jeu = new Jeu421();
        //jeu.jouer();
        Fenetre f = new Fenetre();
        f.setVisible(true);
    }

}
