/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.decorator.textformat;

/**
 *
 * @author tkint
 */
public class DecorateurTexte extends Texte {

    private Texte texte;

    public DecorateurTexte(Texte texte) {
        this.texte = texte;
    }

    @Override
    public String afficheToi() {
        return texte.afficheToi();
    }
}
