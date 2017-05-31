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
public class DessinVecteur implements IDessin {

    @Override
    public void dessineToi() {
        System.out.println("Dessin d'un vecteur");
    }
}
