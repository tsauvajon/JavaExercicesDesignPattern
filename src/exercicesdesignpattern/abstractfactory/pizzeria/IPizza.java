/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.abstractfactory.pizzeria;

import java.util.ArrayList;

/**
 *
 * @author Thomas Kint
 */
public abstract class IPizza {

    protected IFabriqueIngredient fabriqueIngredient;
    protected Pate pate;
    protected Fromage fromage;
    protected Viande viande;

    public IPizza(IFabriqueIngredient fabriqueIngredient) {
        this.fabriqueIngredient = fabriqueIngredient;
    }

    public void afficheToi() {
        System.out.println("------ PIZZA ------");
        if (fromage != null) {
            fromage.afficheToi();
        }
        if (viande != null) {
            viande.afficheToi();
        }
        if (pate != null) {
            pate.afficheToi();
        }
        System.out.println("---- FIN PIZZA ----");
    }
}
