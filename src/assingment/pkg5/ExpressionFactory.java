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
public class ExpressionFactory {
  public static BaseExpr var(String x){
        return new Variable(x);
    }
    
    public static BaseExpr con(double x){
        return new Const(x);
    }
    
    public static BaseExpr add(BaseExpr x, BaseExpr y){
        return new Add(x, y);
    }
    
    public static BaseExpr mul(BaseExpr x, BaseExpr y){
        return new Mul(x, y);
    }
    
    public static BaseExpr neg(BaseExpr x){
        return new Negate(x);
    }
}
