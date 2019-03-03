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
import java.util.HashMap ;

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
    
    e = new Add( new Mul( new Const (2.) , new Const(3.)),new Variable ("x"));;
    
    System.out.println(e);
    System.out.println(e.eval(store));
    System.out.println(e.partialEval());  
    }
}
