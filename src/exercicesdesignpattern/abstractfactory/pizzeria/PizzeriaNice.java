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
public class PizzeriaNice implements IPizzeria {

    @Override
    public IPizza commander(String nom) {
        System.out.println("Pizzeria Nice bonjour!");
        System.out.println("Voici votre pizza " + nom);
        IFabriqueIngredient fabriqueIngredient = new FabriqueIngredientNice();
        IPizza pizza = null;
        switch (nom) {
            case "fromage":
                pizza = new PizzaFromage(fabriqueIngredient);
                break;
            case "viande":
                pizza = new PizzaJambon(fabriqueIngredient);
                break;
            case "kebab":
                pizza = new PizzaKebab(fabriqueIngredient);
                break;
        }
        return pizza;
    }
}
