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
public class Division implements IAritmetica{
    public Division(){}

    @Override
    public double realizarOperacion(double a, double b) {
        return a / b;
    }
    
    
    
}
