package devoirMaison;


import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class devoirMaison {

	public static void main(String[] args) {
		int min =0;
        int max =100;
        int saisie = 0;
        int resultat = 0;

        /* D�claration des variables de stockage du chiffre � trouver
        Utilisation des m�thodes Math.random + transformation en entier
        Le 101 indique le chiffre le plus haut exclusif
        Le 0 indique le point de d�part du chiffre � calculer
        */
        int Chiffreatrouver1 = (int) (Math.random() * 101 + 0);
        int Chiffreatrouver2 = (int) (Math.random() * 101 + 0);
        int Chiffreatrouver3 = (int) (Math.random() * 101 + 0);
       
        System.out.println("Chiffre � trouver num�ro 1 : " + Chiffreatrouver1);
        System.out.println("Chiffre � trouver num�ro 2 : " + Chiffreatrouver2);
        System.out.println("Chiffre � trouver num�ro 3 : " + Chiffreatrouver3);
         
        /* test du premier chiffre */
        for (int nbretentative = 1; nbretentative < 4; nbretentative++)
        {
           if (nbretentative == 3) {
        	   System.out.println(" vous n'avez pas trouv� la bonne combinaison"); 
        	   resultat = 1; 
           }    
            
        System.out.println("tentative de saisie num�ro : "+ nbretentative +"/3 du premier chiffre");
        System.out.println("saisir un nombre entre 0 et 100 : ");
        Scanner keyb = new Scanner (System.in);
        saisie =keyb.nextInt();
        
        if (saisie > Chiffreatrouver1) {
        	System.out.println("Le chiffre saisi est trop haut !");
        }
        
        else {
        	if (saisie < Chiffreatrouver1) {
        		System.out.println("Le chiffre saisi est trop bas !");
        	}
        	else {
        		System.out.println("Le chiffre saisi " + saisie + " est le bon chiffre. Bravo ! Vous pouvez tenter de trouver le second"); 
        		nbretentative = 4;
        		} 
           }
        }
        
        
        /* Test du deuxi�me chiffre si on a trouv� le premier (si resultat <> 1) */
        if (resultat == 0)
                   for (int nbretentative = 1; nbretentative < 4; nbretentative++)
                   {
                    if (nbretentative == 3) {
                    	System.out.println(" vous n'avez pas trouv� la bonne combinaison"); resultat = 1; 
                    } 
                    
                    System.out.println("tentative de saisie num�ro : "+ nbretentative +"/3 du second chiffre");
                    System.out.println("saisir un nombre entre 0 et 100 : ");
                    Scanner keyb = new Scanner (System.in);
                    saisie =keyb.nextInt();
        
                    if (saisie > Chiffreatrouver2) {
                    	System.out.println("Le chiffre saisi est trop haut !");
                    }
                    else{
                    	if (saisie < Chiffreatrouver2) {
                    		System.out.println("Le chiffre saisi est trop bas !");
                    	}
                         else {
                        	 System.out.println("Le chiffre saisi " + saisie + " est le bon chiffre. Bravo ! Vous pouvez tenter de trouver le troisieme"); 
                        	 nbretentative = 4;
                         } 
                        }
                    }
                         
        if (resultat == 0)         
                   for (int nbretentative = 1; nbretentative < 4; nbretentative++)
                  {
                    if (nbretentative == 3) {
                    	System.out.println(" vous n'avez pas trouv� la bonne combinaison"); 
                    	resultat = 1; 
                    } 
                    
                    System.out.println("tentative de saisie num�ro : "+ nbretentative +"/3 du troisi�me chiffre");
                    System.out.println("saisir un nombre entre 0 et 100 : ");
                    Scanner keyb = new Scanner (System.in);
                    saisie =keyb.nextInt();
        
                    if (saisie > Chiffreatrouver3) {
                    	System.out.println("Le chiffre saisi est trop haut !");
                    }
                    else {
                    	if (saisie < Chiffreatrouver3) {
                    		System.out.println("Le chiffre saisi est trop bas !");
                    	}
                         else {
                        	 System.out.println("Le chiffre saisi " + saisie + " est le bon chiffre. Bravo ! Vous avez trouv� le code"); 
                        	 nbretentative = 4;
                         } 
                        }
                    }
                    System.out.println("Le chiffre � trouver �tait : " + Chiffreatrouver1 +" "+ Chiffreatrouver2 +" "+ Chiffreatrouver3);
                 }

	}


