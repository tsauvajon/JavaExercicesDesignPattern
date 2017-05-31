/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsauvajon.interpreter.operations;

/**
 *
 * @author thomas.sauvajon
 */
public class Nombre extends AbstractExpression {
    private int valeur;
    public Nombre(int v) {
        valeur = v;
    }
    
    @Override
    public int interpreter() {
        return valeur;
    }
}
