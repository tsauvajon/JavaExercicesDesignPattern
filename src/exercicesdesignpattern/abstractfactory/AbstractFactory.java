/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.abstractfactory;

import exercicesdesignpattern.abstractfactory.chocolaterie.*;
import exercicesdesignpattern.abstractfactory.chocolaterie.ferrerro.*;
import exercicesdesignpattern.abstractfactory.chocolaterie.scholer.*;
import exercicesdesignpattern.abstractfactory.dessin.*;
import exercicesdesignpattern.abstractfactory.pizzeria.IPizzeria;
import exercicesdesignpattern.abstractfactory.pizzeria.PizzeriaBrest;
import exercicesdesignpattern.abstractfactory.pizzeria.PizzeriaNice;

/**
 *
 * @author Thomas Kint
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        chocolaterie();
//        dessin();
        pizzeria();
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
        IFabriqueADessin fabriqueADessin = new Dessinateur();

        IDessin carre = fabriqueADessin.fabriqueUnDessin("carre");

        IDessin cercle = fabriqueADessin.fabriqueUnDessin("cercle");

        IDessin rectangle = fabriqueADessin.fabriqueUnDessin("rectangle");

        carre.dessineToi();
        cercle.dessineToi();
        rectangle.dessineToi();
        
        fabriqueADessin = new Robot();
        
        IDessin fractale = fabriqueADessin.fabriqueUnDessin("fractale");
        
        IDessin vecteur = fabriqueADessin.fabriqueUnDessin("vecteur");
        
        fractale.dessineToi();
        vecteur.dessineToi();
    }
    
    private static void pizzeria() {
        IPizzeria pizzeriaBrest = new PizzeriaBrest();
        pizzeriaBrest.commander("fromage").afficheToi();
        pizzeriaBrest.commander("viande").afficheToi();
        
        IPizzeria pizzeriaNice = new PizzeriaNice();
        pizzeriaNice.commander("fromage").afficheToi();
        pizzeriaNice.commander("viande").afficheToi();
        pizzeriaNice.commander("kebab").afficheToi();
    }
}
