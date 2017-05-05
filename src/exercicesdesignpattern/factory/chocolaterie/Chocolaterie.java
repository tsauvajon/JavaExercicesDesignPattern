/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory.chocolaterie;

/**
 *
 * @author tkint
 */
public class Chocolaterie {

    private IChocolaterie chocolaterie;

    public Chocolaterie(IChocolaterie chocolaterie) {
        this.chocolaterie = chocolaterie;
    }

    public IChocolaterie getChocolaterie() {
        return chocolaterie;
    }

    public void setChocolaterie(IChocolaterie chocolaterie) {
        this.chocolaterie = chocolaterie;
    }

    public ChocolatLaitAbstrait produitChocolatLait() {
        return this.chocolaterie.produitChocolatLait();
    }

    public ChocolatNoirAbstrait produitChocolatNoir() {
        return this.chocolaterie.produitChocolatNoir();
    }
}
