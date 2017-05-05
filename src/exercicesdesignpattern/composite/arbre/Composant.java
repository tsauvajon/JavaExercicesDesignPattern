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
public class Composant implements IComposantArbre {

    private List<IComposantArbre> composants;

    public Composant() {
        composants = new ArrayList<>();
    }

    public Composant(List<IComposantArbre> composants) {
        this.composants = composants;
    }

    public List<IComposantArbre> getComposants() {
        return composants;
    }

    public void setComposants(List<IComposantArbre> composants) {
        this.composants = composants;
    }

    @Override
    public void dessine() {
        for (IComposantArbre composant : composants) {
            composant.dessine();
        }
        System.out.println("| |");
    }
}
