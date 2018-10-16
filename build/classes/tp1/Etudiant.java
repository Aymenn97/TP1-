/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import static java.time.Clock.system;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Aymen
 */
public class Etudiant {
    private String ID;
    float note[];
    int taille;
    public String Nom,Prenom;
    
    public Etudiant() {
        this.ID = null;
        this.note = null;
        this.taille = 0;
        this.Nom = null;
        this.Prenom = null;
        
    }
    public Etudiant (float[] note) {
        this.note = note.clone();
        this.taille=note.length;
    }
    public void modifier (float[] note, String ID, int taille, String Nom, String Prenom) {
        this.note = note;
        this.ID = ID;
        this.taille = taille;
        this.Nom = Nom;
        this.Prenom = Prenom;
    }
    public String getID () {
        return this.ID;
    }
    public String affichertab (){
        for (int i=0; i<taille;i++){
            System.out.println(note[i]);
        }
        return "";
    }
    public void remplirtab (){
        note = new float[this.taille];
        Random rand = new Random();
        for (int i=0;i<taille;i++){
            note[i] = rand.nextInt(20);
        }
    }
    public void trier () {
        //System.out.println(affichertab());
        Arrays.sort(note);
        System.out.println(affichertab());
        
        
    }
    
}

