/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment.pkg5;

import java.util.Map;

/**
 *
 * @author scatt
 */
public class Const extends NoArgExpr{
    
    private final Double value;
    
    public Const(Double value){
        this.value = value;
    }
    
    @Override
    public String toString() {
        return Double.toString(value);
    }
    
    @Override
    public double eval(Map<String, Double> env) {
        return value;
    }   
    
    @Override
    public BaseExpr partialEval() {
        return this;
    }
}
