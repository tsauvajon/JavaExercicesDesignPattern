/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.facade.imprimante;

/**
 *
 * @author Thomas
 */
public class Imprimante {

    private IFeuille feuilleA3;
    private IFeuille feuilleA4;
    private IFeuille feuilleA5;

    public Imprimante() {
        feuilleA3 = new FeuilleA3();
        feuilleA4 = new FeuilleA4();
        feuilleA5 = new FeuilleA5();
    }

    public void imprimeFeuilleA3() {
        feuilleA3.imprimeToi();
    }

    public void imprimeFeuilleA4() {
        feuilleA4.imprimeToi();
    }

    public void imprimeFeuilleA5() {
        feuilleA5.imprimeToi();
    }
}
