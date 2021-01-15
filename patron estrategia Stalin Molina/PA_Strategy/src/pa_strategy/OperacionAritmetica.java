/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_strategy;

/**
 *
 * @author Stalin
 */
public class OperacionAritmetica {
    
    private IAritmetica estrategia;
  
    
    public OperacionAritmetica(IAritmetica estrategia){
        this.estrategia = estrategia;
    }
    
    
    public double procesar(double a, double b){
        return estrategia.realizarOperacion(a, b);
    }
    
}
