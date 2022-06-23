package plano_mordor.comida;

public abstract class Comida {
    public Comida() {
    }

    protected int pontosDeFelicidade;

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public Comida(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }
}
