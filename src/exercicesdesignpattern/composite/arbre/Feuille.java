/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.composite.arbre;

/**
 *
 * @author tkint
 */
public class Feuille implements ComposantArbre {

    @Override
    public void dessine() {
        System.out.print("<>");
    }
}
