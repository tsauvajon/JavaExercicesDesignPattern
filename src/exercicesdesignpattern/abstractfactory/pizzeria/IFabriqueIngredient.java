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
public interface IFabriqueIngredient {

    public Pate fabriquePate(String type);
    
    public Fromage fabriqueFromage(String type);
    
    public Viande fabriqueViande(String type);
}
