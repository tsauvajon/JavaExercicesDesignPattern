/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.strategy.personnage;

/**
 *
 * @author tkint
 */
public class Personnage {

    private ICombat monStyleDeCombat;

    public void batsToi() {
        monStyleDeCombat.executeToi();
    }

    public ICombat getMonStyleDeCombat() {
        return monStyleDeCombat;
    }

    public void setMonStyleDeCombat(ICombat monStyleDeCombat) {
        this.monStyleDeCombat = monStyleDeCombat;
    }
}
