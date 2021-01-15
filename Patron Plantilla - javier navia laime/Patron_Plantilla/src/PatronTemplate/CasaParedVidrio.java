package PatronTemplate;

public class CasaParedVidrio extends Casa {

    @Override
    public void decorarCasa() {
        System.out.println("Decorando la casa de vidrio");
        toString = toString + "Decorando la casa de vidrio \n";

    }

    @Override
    public void pintarCasa() {
        System.out.println("Pintando Pared De la casa de vidrio");
        toString = toString + "Pintando Pared De la casa de vidrio \n";

    }

    @Override
    public void construirPuerta() {
        System.out.println("Construllendo las puertas de la casa de vidrio");
        toString = toString + "Construllendo las puertas de la casa de vidrio \n";

    }

    @Override
    public void construirVentanas() {
        System.out.println("Construllendo las ventana de la casa de vidrio");
        toString = toString + "Construllendo las ventana de la casa de vidrio \n";

    }

    @Override
    public void construirMuros() {
        System.out.println("Construllendo los muros de la casa de vidrio");
        toString = toString + "Construllendo los muros de la casa de vidrio \n";

    }
}
