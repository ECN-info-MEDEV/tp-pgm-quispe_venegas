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
    private final String nomFichier;
    private int largueur;
    private int hauteur;
    private int niveauxGris;
    private ArrayList<ArrayList<Integer>> matrix;
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public ImagePGM(String nomFichier) {
        this.nomFichier = nomFichier;
        this.matrix = new ArrayList<>();
    }
}