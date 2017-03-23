/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.decorator.facture;

/**
 *
 * @author tkint
 */
public class FactureSimple extends Facture {

    @Override
    public void imprimeToi() {
        System.out.println("Impression d'une facture simple");
    }
}
