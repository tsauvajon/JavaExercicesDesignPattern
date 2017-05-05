/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.abstractfactory.chocolaterie.ferrerro;

import exercicesdesignpattern.abstractfactory.chocolaterie.ChocolatLaitAbstrait;
import exercicesdesignpattern.abstractfactory.chocolaterie.ChocolatNoirAbstrait;
import exercicesdesignpattern.abstractfactory.chocolaterie.IChocolaterie;

/**
 *
 * @author tkint
 */
public class Ferrerro implements IChocolaterie {

    @Override
    public ChocolatLaitAbstrait produitChocolatLait() {
        return new ChocolatLaitFerrerro();
    }

    @Override
    public ChocolatNoirAbstrait produitChocolatNoir() {
        return new ChocolatNoirFerrerro();
    }

}
