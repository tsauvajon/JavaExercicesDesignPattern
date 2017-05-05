/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.strategy.canard;

/**
 *
 * @author tkint
 */
public abstract class Canard {

    private IVol maFaconDeVoler;

    public void faisCoinCoin() {
        System.out.println("Coin coin");
    }

    public void nage() {
        System.out.println("Je naaaaaaaaaage");
    }

    public void afficheToi() {
        System.out.println("Je suis un canard");
    }

    public void setMaFaconDeVoler(IVol v) {
        maFaconDeVoler = v;
    }

    public void envoleToi() {
        maFaconDeVoler.vole();
    }
}