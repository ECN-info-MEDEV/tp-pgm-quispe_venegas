/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.medev.traitementdimage;

import java.io.FileNotFoundException;

/**
 *
 * @author Isaias
 */
public class TraitementDImage {
    public static void main(String[] args) throws FileNotFoundException{
        int[] infoPGM;
        int[][] matrice;
        ImagePGM image;
        
        LecteurPGM lecteur = new LecteurPGM("baboon");
        infoPGM = lecteur.readPGMFile();
        matrice = lecteur.creerMatrice(infoPGM[0],infoPGM[1]);
        image = new ImagePGM(infoPGM[0],infoPGM[1],infoPGM[2], matrice);
        
    }
}
