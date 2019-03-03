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
public class Negate extends OneArgExpr{
    
    private BaseExpr x;
    
    public Negate(BaseExpr x){
        super(x); 
    }
    
    @Override
    public double eval(Map<String, Double> env) {
        return -(getX().eval(env));
    }

    @Override
    public BaseExpr partialEval() {
        if(getX() instanceof Const){
            return new Const(-getX().eval(null));
        }
        else return new Negate (getX().partialEval());
    }

    @Override
    protected String getOperator() {
        return "-";
    }
    
}
