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
public class FabriqueIngredientNice implements IFabriqueIngredient {

    @Override
    public Pate fabriquePate(String type) {
        return new PateClassique();
    }

    @Override
    public Fromage fabriqueFromage(String type) {
        return new FromageBlanc();
    }

    @Override
    public Viande fabriqueViande(String type) {
        Viande viande = null;
        switch (type) {
            case "jambon":
                viande = new ViandeJambon();
                break;
            case "kebab":
                viande = new ViandeKebab();
                break;
        }
        return viande;
    }
}
