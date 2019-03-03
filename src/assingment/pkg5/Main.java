package assingment.pkg5;

/**
 *
 * @author scatt
 */

import java.util.Map ;
import java.util.HashMap ;
import static assingment.pkg5.ExpressionFactory .*;





public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Map < String , Double > store = new HashMap < >();
    store.put ("pi", 3.1415);
    store.put (" cactus ", 34.);
    store.put ("x", 3.);
    store.put ("y", 5.);
 
    BaseExpr e; 
    
    e = add(neg(var("x")),con(3.));
    
    System.out.println(e);
    System.out.println(e.eval(store));
    System.out.println(e.partialEval());  
    }
}
