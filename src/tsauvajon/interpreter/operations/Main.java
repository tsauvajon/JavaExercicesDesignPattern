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
public class Main {
    public static void main(String[] args) {
        AbstractExpression n = new Nombre(123);
        AbstractExpression e1 = new Addition(new Nombre(34), n);
        System.out.println(e1.interpreter());
        System.out.println(n.interpreter());
    }
}
