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
public class Addition extends Binaire {

    public Addition(AbstractExpression o1, AbstractExpression o2) {
        super(o1, o2);
    }
    
    @Override
    public int interpreter() {
        return op1.interpreter() + op2.interpreter();
    }
}
