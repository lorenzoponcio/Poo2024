abstract class retanguloNormal {
    protected int largura;
    protected int altura;
    protected String texto;

    public retanguloNormal(int largura, int altura, String texto) {
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
    }

    public abstract void desenhar();
}
