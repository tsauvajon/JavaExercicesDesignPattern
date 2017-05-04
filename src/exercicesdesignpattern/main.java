/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern;

import exercicesdesignpattern.decorator.textformat.*;
import exercicesdesignpattern.decorator.facture.*;
import exercicesdesignpattern.strategy.canard.*;
import exercicesdesignpattern.adapter.dindon.*;
import exercicesdesignpattern.composite.arbre.*;
import exercicesdesignpattern.decorator.upperreader.*;
import exercicesdesignpattern.singleton.Singleton;
import exercicesdesignpattern.strategy.personnage.*;
import exercicesdesignpattern.strategy.logger.*;
import exercicesdesignpattern.factory.ferrerro.*;
import exercicesdesignpattern.factory.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author tkint
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //canardTest();
        //personnageTest();
        //logTest();
        //dodoTest();
        //factureTest();
        //texteTest();
        //upperReaderTest();
        //singletonTest();
        //chocolaterieTest();
        arbreTest();
    }

    private static void canardTest() {
        List<Canard> canards = new ArrayList<>();
        canards.add(new Morillon());
        canards.add(new Colvert());
        canards.add(new CanardEnBois());

        for (Canard canard : canards) {
            canard.afficheToi();
            canard.envoleToi();
            canard.nage();
        }

        canards.get(2).setMaFaconDeVoler(new VolAvecAiles());
        canards.get(2).afficheToi();
        canards.get(2).envoleToi();
    }

    private static void personnageTest() {
        List<Personnage> personnages = new ArrayList<>();
        personnages.add(new Chevalier());
        personnages.add(new Brigand());
        personnages.add(new Troll());

        for (Personnage personnage : personnages) {
            personnage.batsToi();
        }

        personnages.get(1).setMonStyleDeCombat(new CombatALaHache());
        personnages.get(1).batsToi();
    }

    private static void logTest() {
        Logger log = new Logger_Console(new Formater_HTML());
        log.write("Mon log en HTML");
        log.setFormater(new Formater_XML());
        log.write("Mon log en XML");
    }

    private static void dodoTest() {
        List<Canard> canards = new ArrayList<>();
        canards.add(new Morillon());
        canards.add(new Colvert());
        canards.add(new CanardEnBois());
        canards.add(new CanardDindon(new Dodo()));

        for (Canard canard : canards) {
            canard.afficheToi();
            canard.faisCoinCoin();
        }
    }

    private static void factureTest() {
        Facture facture = new Entete("Thomas KINT", new Pub("WinDev", new Pub("Ruby On Rails", new FactureSimple())));
        facture.imprimeToi();
    }

    private static void texteTest() {
        Texte texte = new Italique(new Gras(new TexteSimple("Salut")));
        System.out.println(texte.afficheToi());
    }

    private static void upperReaderTest() {
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
                java.util.logging.Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            System.out.println("Fichier non trouvé!");
        }
    }

    private static void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        singleton = Singleton.getInstance();
    }

    private static void chocolaterieTest() {
        Chocolaterie chocolaterie = new Chocolaterie(new Ferrerro());
        chocolaterie.produitChocolatLait().afficheToi();
        chocolaterie.produitChocolatNoir().afficheToi();
    }

    private static void arbreTest() {
        ArrayList<ComposantArbre> branches = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Composant branche = new Composant();
            
            for (int j = 0; j < 10; j++) {
                branche.getComposants().add(new Feuille());
            }
            
            branches.add(branche);
        }

        Composant arbre = new Composant(branches);
        arbre.dessine();
    }
}
