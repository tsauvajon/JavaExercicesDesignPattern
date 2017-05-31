/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.abstractfactory.pizzeria;

/**
 *
 * @author Thomas Kint
 */
public class PizzaJambon extends IPizza {

    public PizzaJambon(IFabriqueIngredient fabriqueIngredient) {
        super(fabriqueIngredient);
        pate = (Pate) this.fabriqueIngredient.fabriquePate(null);
        fromage = (Fromage) this.fabriqueIngredient.fabriqueFromage(null);
        viande = (Viande) this.fabriqueIngredient.fabriqueViande("jambon");
    }
}
