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
public class TexteSimple extends Texte {

    private String texte;

    public TexteSimple(String texte) {
        this.texte = texte;
    }
    
    @Override
    public String afficheToi() {
        return texte;
    }
}
