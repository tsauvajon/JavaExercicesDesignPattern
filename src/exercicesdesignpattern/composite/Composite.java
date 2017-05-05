/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.composite;

import exercicesdesignpattern.composite.arbre.*;
import java.util.ArrayList;

/**
 *
 * @author Thomas Kint
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arbre();
    }

    private static void arbre() {
        ArrayList<IComposantArbre> branches = new ArrayList<>();

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
