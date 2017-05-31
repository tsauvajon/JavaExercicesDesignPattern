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
public abstract class Binaire extends AbstractExpression {
    AbstractExpression op1;
    AbstractExpression op2;
    
    Binaire(AbstractExpression o1, AbstractExpression o2) {
        op1 = o1;
        op2 = o2;
    }
}
