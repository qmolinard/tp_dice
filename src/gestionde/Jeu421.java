/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import java.util.Scanner;

/**
 *
 * @author csnd2348
 */
public class Jeu421 {

    private De d1;
    private De d2;
    private De d3;
    private boolean nombre4;
    private boolean nombre2;
    private boolean nombre1;
    int nombreCoups;

    public Jeu421() {
        /*    this.d1 = new De();
        this.d2 = new De();
        this.d3 = new De();
        
        nombreCoups=0;

        nombre4 = false;
        nombre2 = false;
        nombre1 = false;

        d1.lancer();
        d2.lancer();
        d3.lancer();
            
        nombreCoups++;
        
        
        while (nombre4 != true && nombre2 != true && nombre1 != true) {
            
            
            
            if(nombreCoups>0)
            {
                System.out.println("Quel dé jouer : ");
                Scanner sc = new Scanner(System.in);
                int choix = sc.nextInt();
                
                if(choix==1)
                {
                    d1.lancer();
                }
                
                if(choix==2)
                {
                    d2.lancer();
                }
                
                if(choix==3)
                {
                    d3.lancer();
                }
            }

            if (d1.getValeur() == 4 || d2.getValeur() == 4 || d3.getValeur() == 4) {
                nombre4=true;

            }
            
            if (d1.getValeur() == 2 || d2.getValeur() == 2 || d3.getValeur() == 2) {
                nombre2=true;

            }
            
            if (d1.getValeur() == 1 || d2.getValeur() == 1 || d3.getValeur() == 1) {
                nombre1=true;

            }
            
            nombreCoups++;
            
            if(nombre4==true && nombre2 == true && nombre1 == true)
            {
                System.out.println("De 1 : " + d1.getValeur() + "\n De 2 : " + d2.getValeur() + "\n De 3 : " + d3.getValeur() + "\n Nombre d'essais : " + nombreCoups + "\n VICTOIRE");
            }
            
            else{
            System.out.println("relance");
            }
        }
         */
    }

    public void jouer() {
        this.d1 = new De();
        this.d2 = new De();
        this.d3 = new De();

        nombreCoups = 0;

        nombre4 = false;
        nombre2 = false;
        nombre1 = false;

       // while (nombre4 != true && nombre2 != true && nombre1 != true) {
       while(!nombre4 || !nombre1 || !nombre2) {
            if(nombreCoups == 0){
            d1.lancer();
            d2.lancer();
            d3.lancer();
            }
            
            
            if (nombreCoups > 0) {
                System.out.println("Quel dé jouer : ");
                Scanner sc = new Scanner(System.in);
                int choix = sc.nextInt();

                if (choix == 1) {
                    d1.lancer();
                }

                if (choix == 2) {
                    d2.lancer();
                }

                if (choix == 3) {
                    d3.lancer();
                }
            }

            if (d1.getValeur() == 4 || d2.getValeur() == 4 || d3.getValeur() == 4) {
                nombre4 = true;

            }

            if (d1.getValeur() == 2 || d2.getValeur() == 2 || d3.getValeur() == 2) {
                nombre2 = true;

            }

            if (d1.getValeur() == 1 || d2.getValeur() == 1 || d3.getValeur() == 1) {
                nombre1 = true;

            }

            nombreCoups++;

            if (nombre4 == true && nombre2 == true && nombre1 == true) {
                System.out.println("De 1 : " + d1.getValeur() + "\n De 2 : " + d2.getValeur() + "\n De 3 : " + d3.getValeur() + "\n Nombre d'essais : " + nombreCoups + "\n VICTOIRE");
            } else {
                System.out.println("De 1 : " + d1.getValeur() + "\n De 2 : " + d2.getValeur() + "\n De 3 : " + d3.getValeur() + "\n Nombre d'essais : " + nombreCoups);
            }
        }

    }

    @Override
    public String toString() {
        return "De 1 : " + d1.getValeur() + "\n De 2 : " + d2.getValeur() + "\n De 3 : " + d3.getValeur() + "\n Nombre d'essais : " + nombreCoups;
    }

}
