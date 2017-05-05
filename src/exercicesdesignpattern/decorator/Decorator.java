/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.decorator;

import exercicesdesignpattern.decorator.facture.*;
import exercicesdesignpattern.decorator.textformat.*;
import exercicesdesignpattern.decorator.upperreader.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

/**
 *
 * @author Thomas Kint
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        facture();
        textFormat();
        upperReader();
    }

    private static void facture() {
        Facture facture = new Entete("Thomas KINT", new Pub("WinDev", new Pub("Ruby On Rails", new FactureSimple())));
        facture.imprimeToi();
    }

    private static void textFormat() {
        Texte texte = new Italique(new Gras(new TexteSimple("Salut")));
        System.out.println(texte.afficheToi());
    }

    private static void upperReader() {
        File file = new File("D:\\tkint\\Documents\\NetBeansProjects\\ExercicesDesignPattern\\src\\exercicesdesignpattern\\decorator\\upperreader\\test.txt");

        if (file.exists()) {
            BufferedReader reader = null;
            try {
                System.out.println("Ouverture du fichier...");
                System.out.println("-----------------------");
                reader = new CustomReader(new FileReader(file));
                while (reader.ready()) {
                    System.out.println(reader.readLine());
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Fichier non trouvé!");
            } catch (IOException ex) {
                System.out.println("Erreur d'entrées sorties!");
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                    System.out.println("Erreur d'entrées sorties!");
                }
            }
        } else {
            System.out.println("Fichier non trouvé!");
        }
    }
}
