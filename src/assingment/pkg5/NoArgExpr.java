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
public abstract class NoArgExpr implements BaseExpr{
    
    @Override
    public abstract String toString();
        
    @Override
    public abstract double eval( Map<String, Double> env );   
}
