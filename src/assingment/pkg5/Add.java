package assingment.pkg5;

import java.util.Map;

/**
 *
 * @author scatt
 */
public class Add extends TwoArgExpr{
    
    BaseExpr x,y;
    
    public Add( BaseExpr x, BaseExpr y ) {
        super ( x, y);
    }
  
    @Override
    protected final String getOperator() {
        return "+";
    }

    @Override
    public double eval(Map<String, Double> env) {
        return getX().eval(env) + getY().eval(env);
    }
    
    @Override
    public BaseExpr partialEval() {
        if (getX() instanceof Const && getY() instanceof Const)
            return new Const(getX().eval(null)+ getY().eval(null));
        else if (getX() instanceof Variable){
                if (!( getY() instanceof Variable)&& !( getY() instanceof Const) )
                   return new Add(getX(),getY().partialEval()).partialEval();
                else
                   return this;
        }
        else if( getY() instanceof Variable){
                if (!( getX() instanceof Variable)&& !( getX() instanceof Const) )
                   return new Add(getX().partialEval(),getY()).partialEval(); 
                else
                    return this;
        }
        else{
              return new Add(getX().partialEval(),getY().partialEval()).partialEval();  
        }
    }
}