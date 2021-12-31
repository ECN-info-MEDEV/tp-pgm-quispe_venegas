/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.medev.traitementdimage;

import java.io.*;
import java.util.*;

/**
 *
 * @author Isaias
 */
public class ImagePGM {
    private int largueur;
    private int hauteur;
    private int niveauxGris;
    private int[][] matrice;

    public ImagePGM(int largueur, int hauteur, int maxGris, int[][] matrice) throws FileNotFoundException {
        this.largueur = largueur;
        this.hauteur = hauteur;
        this.niveauxGris = maxGris;
        this.matrice = matrice;
    }

    public int getLargueur() {
        return largueur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int[][] getMatrice() {
        return matrice;
    }

    public void setLargueur(int largueur) {
        this.largueur = largueur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setNiveauxGris(int niveauxGris) {
        this.niveauxGris = niveauxGris;
    }
    
    public void afficherMatrice(){
        for(int[] ligne : matrice){
            for(int pixel : ligne){
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
    
}