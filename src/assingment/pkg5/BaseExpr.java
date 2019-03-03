package assingment.pkg5;

/**
 *
 * @author scatt
 */
import java.util.Map ;
public interface BaseExpr {
    
    @Override
    public String toString();
    
    public double eval( Map<String, Double> env );
    
    public BaseExpr partialEval(); 
}
