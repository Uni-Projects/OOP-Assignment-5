/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
