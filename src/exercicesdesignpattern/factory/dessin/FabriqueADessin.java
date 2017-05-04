/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory.dessin;

/**
 *
 * @author Thomas
 */
public class FabriqueADessin {

    public Dessin fabriqueUnDessin(String type) {
        Dessin dessin = null;
        switch (type) {
            case "carre":
                dessin = new DessinCarre();
                break;
            case "cercle":
                dessin = new DessinCercle();
                break;
            case "rectangle":
                dessin = new DessinRectangle();
                break;
        }

        return dessin;
    }
}
