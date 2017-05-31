/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.abstractfactory.chocolaterie.scholer;

import exercicesdesignpattern.abstractfactory.chocolaterie.ChocolatLaitAbstrait;
import exercicesdesignpattern.abstractfactory.chocolaterie.ChocolatNoirAbstrait;
import exercicesdesignpattern.abstractfactory.chocolaterie.IChocolaterie;

/**
 *
 * @author tkint
 */
public class Scholer implements IChocolaterie {

    @Override
    public ChocolatLaitAbstrait produitChocolatLait() {
        return new ChocolatLaitScholer();
    }

    @Override
    public ChocolatNoirAbstrait produitChocolatNoir() {
        return new ChocolatNoirScholer();
    }

}
