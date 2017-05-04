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
public class DessinRectangle implements Dessin {

    @Override
    public void dessineToi() {
        System.out.println("Dessin d'un rectangle");
    }
}
