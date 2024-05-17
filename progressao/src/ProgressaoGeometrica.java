public class ProgressaoGeometrica extends Progressao {
    private int inicio;
    private int razao;
    private int atual;

    public ProgressaoGeometrica(int inicio, int razao) {
        this.inicio = inicio;
        this.razao = razao;
        this.atual = inicio;
    }

    @Override
    public int proximo() {
        int resultado = this.atual;
        this.atual *= this.razao;
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

    public int getRazao() {
        return razao;
    }

    public void setRazao(int razao) {
        this.razao = razao;
    }

    public int getAtual() {
        return atual;
    }

    public void setAtual(int atual) {
        this.atual = atual;
    }
}
