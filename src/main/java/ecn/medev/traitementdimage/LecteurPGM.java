/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecn.medev.traitementdimage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Isaias
 */
public class LecteurPGM {
    BufferedReader reader;
    String delimiteur = "  ";

    public LecteurPGM(String nomFichier) throws FileNotFoundException  {
        this.reader = new BufferedReader(new FileReader(nomFichier+".pgm"));
    }
    
    public int[] readPGMFile(){
        StringTokenizer tokenizerSize;
        int [] values = new int[3];
        try {
            reader.readLine();
            reader.readLine();
            tokenizerSize = new StringTokenizer(reader.readLine(), delimiteur);
            values[0] = Integer.parseInt(tokenizerSize.nextToken()); //Largueur
            values[1] = Integer.parseInt(tokenizerSize.nextToken()); // Hauteur
            values[2] = Integer.parseInt(reader.readLine()); // maxGris
        } 
        catch (IOException | NumberFormatException e) {
        }
        return values;
    }
    
    public int[][] creerMatrice(int larg, int haut){
        StringTokenizer tokenizerPixel;
        int [][] matrice;
        int[] ligne;
        matrice = new int[haut][larg];
        try {
            int i = 0;
            while (i<haut){
                ligne = new int[larg];
                tokenizerPixel = new StringTokenizer(reader.readLine(), delimiteur);
                int j = 0;
                while (j<larg){
                    if (tokenizerPixel.hasMoreTokens()){
                        ligne[j]=Integer.parseInt(tokenizerPixel.nextToken());
                        j++;
                    } else {
                        tokenizerPixel = new StringTokenizer(reader.readLine(), delimiteur); 
                    }
                }
                matrice[i]= ligne;
                i++;
            }
        }
        catch(IOException | NumberFormatException e) {
        }
        
        return matrice;
    }
    
}
