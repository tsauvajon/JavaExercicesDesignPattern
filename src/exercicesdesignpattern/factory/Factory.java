/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory;

import exercicesdesignpattern.factory.chocolaterie.*;
import exercicesdesignpattern.factory.chocolaterie.ferrerro.*;
import exercicesdesignpattern.factory.chocolaterie.scholer.Scholer;
import exercicesdesignpattern.factory.dessin.*;

/**
 *
 * @author Thomas Kint
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        chocolaterie();
        dessin();
    }

    private static void chocolaterie() {
        Chocolaterie chocolaterie = new Chocolaterie(new Ferrerro());
        chocolaterie.produitChocolatLait().afficheToi();
        chocolaterie.produitChocolatNoir().afficheToi();
        
        chocolaterie.setChocolaterie(new Scholer());
        chocolaterie.produitChocolatLait().afficheToi();
        chocolaterie.produitChocolatNoir().afficheToi();
    }

    private static void dessin() {
        FabriqueADessin fabriqueADessin = new FabriqueADessin();

        Dessin carre = fabriqueADessin.fabriqueUnDessin("carre");

        Dessin cercle = fabriqueADessin.fabriqueUnDessin("cercle");

        Dessin rectangle = fabriqueADessin.fabriqueUnDessin("rectangle");

        carre.dessineToi();
        cercle.dessineToi();
        rectangle.dessineToi();

    }
}
