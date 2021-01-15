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
public class PA_Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionAritmetica context;
        
        context = new OperacionAritmetica(new Sumar());
        double suma = context.procesar(3, 4);

        context = new OperacionAritmetica(new Restar());
        double resta = context.procesar(3, 4);
        
        context = new OperacionAritmetica(new Multiplicar());
        double multiplicacion = context.procesar(3, 4);

        context = new OperacionAritmetica(new Division());
        double division = context.procesar(3, 4);        
        
        System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Multiplicacion:" + multiplicacion);
        System.out.println("Division:" + division);
    }
    
}
