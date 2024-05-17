public class ProgressaoAritmetica extends Progressao {
    private int inicio;
    private int passo;
    private int atual;

    public ProgressaoAritmetica(int inicio, int passo) {
        this.inicio = inicio;
        this.passo = passo;
    }

    @Override
    public int proximo() {
        int resultado = this.atual;
        this.atual += this.passo;
        return resultado;
    }

    @Override
    public void reiniciar() {
        this.atual = this.inicio;
    }


public int getInicio() {
    return inicio;
}

public void setInicio(int inicio) {
    this.inicio = inicio;
    reiniciar();
}

public int getPasso() {
    return passo;
}

public void setPasso(int passo) {
    this.passo = passo;
}

public int getAtual() {
    return atual;
}

public void setAtual(int atual) {
    this.atual = atual;
}
}