/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.facade;

import exercicesdesignpattern.facade.imprimante.*;

/**
 *
 * @author Thomas Kint
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimante();
    }

    private static void imprimante() {
        Imprimante imprimante = new Imprimante();
        imprimante.imprimeFeuilleA3();
        imprimante.imprimeFeuilleA4();
        imprimante.imprimeFeuilleA5();
    }
}
