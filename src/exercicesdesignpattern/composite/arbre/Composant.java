/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.composite.arbre;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tkint
 */
public class Composant implements ComposantArbre {

    private List<ComposantArbre> composants;

    public Composant() {
        composants = new ArrayList<>();
    }

    public Composant(List<ComposantArbre> composants) {
        this.composants = composants;
    }

    public List<ComposantArbre> getComposants() {
        return composants;
    }

    public void setComposants(List<ComposantArbre> composants) {
        this.composants = composants;
    }

    @Override
    public void dessine() {
        for (ComposantArbre composant : composants) {
            composant.dessine();
        }
        System.out.println("| |");
    }
}
