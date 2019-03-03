package assingment.pkg5;

import java.util.Map;

/**
 *
 * @author scatt
 */
public abstract class TwoArgExpr implements BaseExpr {

    private final BaseExpr x, y;
   
    public TwoArgExpr( BaseExpr x, BaseExpr y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public abstract double eval( Map<String, Double> env );
    
    @Override 
    public abstract BaseExpr partialEval();
    
    @Override
    public String toString() {
        return "(" + x + getOperator() + y + ")";
    }
    protected abstract String getOperator();
    
    public BaseExpr getX(){
        return this.x;
    }
    
    public BaseExpr getY(){
        return this.y;
    }
}
