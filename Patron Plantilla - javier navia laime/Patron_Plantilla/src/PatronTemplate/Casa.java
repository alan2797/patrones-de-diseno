package PatronTemplate;

public abstract class Casa {

    protected String toString = "";

    public final String contruirCasa() {
        construirBase();
        constructTecho();
        construirMuros();
        construirVentanas();
        construirPuerta();
        pintarCasa();
        decorarCasa();
        return toString;
    }

    public abstract void decorarCasa();

    public abstract void pintarCasa();

    public abstract void construirPuerta();

    public abstract void construirVentanas();

    public abstract void construirMuros();

    private final void constructTecho() {
        toString = toString + "El Techo ha sido construido. \n";
    }

    private final void construirBase() {

        toString = toString + "La Base ha sido construida. \n";
    }
}
