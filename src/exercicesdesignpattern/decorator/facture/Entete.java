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
public class Entete extends DecorateurDeFacture {

    private String name;
    
    public Entete(String name, Facture objetDecore) {
        super(objetDecore);
        this.name = name;
    }

    @Override
    public void imprimeToi() {
        imprimeEntete();
        super.imprimeToi();
    }

    private void imprimeEntete() {
        System.out.println("Impression de l'entête " + name);
    }
}
