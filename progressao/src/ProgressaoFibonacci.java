public class ProgressaoFibonacci extends Progressao {
    private int anterior;
    private int atual;

    public ProgressaoFibonacci() {
        this.anterior = 0;
        this.atual = 1;
    }

    @Override
    public int proximo() {
        int resultado = this.anterior;
        int novoAtual = this.anterior + this.atual;
        this.anterior = this.atual;
        this.atual = novoAtual;
        return resultado;
    }

    @Override
    public void reiniciar() {
        this.anterior = 0;
        this.atual = 1;
    }

    public int getAnterior() {
        return anterior;
    }

    public void setAnterior(int anterior) {
        this.anterior = anterior;
    }

    public int getAtual() {
        return atual;
    }

    public void setAtual(int atual) {
        this.atual = atual;
    }
}


