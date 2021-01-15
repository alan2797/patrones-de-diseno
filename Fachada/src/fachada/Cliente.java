package fachada;

public class Cliente {

    public static void main(String[] args) {

       BancaFacade BF = new BancaFacade();
        
        BF.introducirCredenciales(1234567890, 1234);
        BF.retirarDinero(50.00);
        BF.retirarDinero(900.00);
        BF.depositoEfectivo(200.00);
        BF.retirarDinero(900.00);

    }
}
