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
public abstract class DecorateurDeFacture extends Facture {

    private Facture objetDecore;

    public DecorateurDeFacture(Facture objetDecore) {
        this.objetDecore = objetDecore;
    }

    @Override
    public void imprimeToi() {
        if (objetDecore != null) {
            objetDecore.imprimeToi();
        }
    }
}
