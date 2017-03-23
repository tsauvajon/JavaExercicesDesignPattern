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
public class Pub extends DecorateurDeFacture {

    private String name;
    
    public Pub(String name, Facture objetDecore) {
        super(objetDecore);
        this.name = name;
    }

    @Override
    public void imprimeToi() {
        super.imprimeToi();
        imprimePub();
    }

    private void imprimePub() {
        System.out.println("Impression de la pub " + name);
    }
}
