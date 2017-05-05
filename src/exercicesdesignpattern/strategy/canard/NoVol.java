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
public class NoVol implements IVol {

    @Override
    public void vole() {
        System.out.println("Je ne vole pas... Je me sens si seul...");
    }
}
