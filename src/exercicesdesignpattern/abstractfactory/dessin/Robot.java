/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.abstractfactory.dessin;

/**
 *
 * @author Thomas
 */
public class Robot implements IFabriqueADessin {

    public IDessin fabriqueUnDessin(String type) {
        IDessin dessin = null;
        switch (type) {
            case "fractale":
                dessin = new DessinFractale();
                break;
            case "vecteur":
                dessin = new DessinVecteur();
                break;
        }

        return dessin;
    }
}
