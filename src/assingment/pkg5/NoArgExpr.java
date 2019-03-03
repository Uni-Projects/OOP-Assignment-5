package assingment.pkg5;

import java.util.Map;

/**
 *
 * @author scatt
 */
public abstract class NoArgExpr implements BaseExpr{
    
    @Override
    public abstract String toString();
        
    @Override
    public abstract double eval( Map<String, Double> env );   
}
