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
public class Mul extends TwoArgExpr{
        
    BaseExpr x,y;
    
    public Mul( BaseExpr x, BaseExpr y ) {
        super ( x, y);
    }
  
    @Override
    protected final String getOperator() {
        return "*";
    }

    @Override
    public double eval(Map<String, Double> env) {
        return (getX().eval(env) * getY().eval(env));
    }

    @Override
    public BaseExpr partialEval() {
        if (getX() instanceof Const && getY() instanceof Const)
            return new Const(getX().eval(null)* getY().eval(null));
        else if (getX() instanceof Variable){
                if (!( getY() instanceof Variable)&& !( getY() instanceof Const) )
                   return new Mul(getX(),getY().partialEval()).partialEval();
                else
                   return this;
        }
        else if( getY() instanceof Variable){
                if (!( getX() instanceof Variable)&& !( getX() instanceof Const) )
                   return new Mul(getX().partialEval(),getY()).partialEval(); 
                else
                    return this;
        }
        else{
              return new Mul(getX().partialEval(),getY().partialEval()).partialEval();  
        }
    }
}
    
