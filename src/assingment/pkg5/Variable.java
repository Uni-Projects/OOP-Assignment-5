package assingment.pkg5;

import java.util.Map;

/**
 *
 * @author scatt
 */
public class Variable extends NoArgExpr{
    
    private final String name;
    
    public Variable(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
   
    @Override
    public double eval( Map <String, Double> env ) {
        return env.get(name);
    }  

    @Override
    public BaseExpr partialEval() {
        return this;
    }
}
