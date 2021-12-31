/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecn.medev.traitementdimage;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jquis
 */
public class UnitairesTest {
    
    private static LecteurPGM lecteur;

    public UnitairesTest(){
        
    }
    
    @BeforeAll
    public static void setUpClass() throws FileNotFoundException{
        lecteur = new LecteurPGM("testFile");
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testReadPGMFile() throws FileNotFoundException {
        lecteur = new LecteurPGM("testFile");
        int[] infoPGM = this.lecteur.readPGMFile();
        assertEquals(infoPGM.length, 3);
        assertEquals(infoPGM[0], 2);
        assertEquals(infoPGM[1], 2);
        assertEquals(infoPGM[2], 255);
    }
    
    @Test
    public void testCreerMatrice() throws FileNotFoundException {
        lecteur = new LecteurPGM("testFile");
        int[] infoPGM = this.lecteur.readPGMFile();
        int[][] matrice = this.lecteur.creerMatrice(infoPGM[0],infoPGM[1]);
        
        System.out.println(matrice.length);
        System.out.println(matrice[0].length);
        System.out.println(matrice[1].length);
        
        assertEquals(matrice.length, 2);
        assertEquals(matrice[0].length, 2);
        assertEquals(matrice[1].length, 2);
    }
    
}
