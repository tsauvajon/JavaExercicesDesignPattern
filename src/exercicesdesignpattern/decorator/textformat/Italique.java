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
public class Italique extends DecorateurTexte {
    
    public Italique(Texte texte) {
        super(texte);
    }

    @Override
    public String afficheToi() {
        return "<i>" + super.afficheToi() + "</i>";
    }
}
