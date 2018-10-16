/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Aymen
 */
public class TestEtudiant {
    public static void main(String args[]) {
        Etudiant e1 = new Etudiant();
        System.out.println(e1.getID()+e1.note+e1.Nom+e1.Prenom+e1.taille);
        
        int taille ;
        float[] note;
        Scanner input = new Scanner(System.in);
        System.out.println("entrez valeur");
        taille = input.nextInt();
        note = new float[taille];
        System.out.println("entrez valeur tableau");        
        //for (int i=0; i<taille;i++){
            //note[i] = input.nextInt();
        //}
        
        System.out.println();
        Etudiant e2 = new Etudiant(note);
        String Nom;
        String Prenom;
        String ID;
        System.out.println("entrez votre Nom");
        Nom = input.next();
        System.out.println("entrez votre prenom");
        Prenom = input.next();
        System.out.println("entrez votre ID");
        ID = input.next();
        e2.modifier(note, ID, taille, Nom, Prenom);
      
        e2.remplirtab();
        e2.affichertab();
        e2.trier();
    }
        
    

  
    
}
