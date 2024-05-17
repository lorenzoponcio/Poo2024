class retanguloArredondado extends retanguloNormal {
    public retanguloArredondado(int largura, int altura, String texto) {
        super(largura, altura, texto);
    }

    @Override
    public void desenhar() {

        System.out.println("╭" + "─".repeat(largura - 2) + "╮");
        for (int i = 0; i < altura - 2; i++) {
            if (i == (altura - 2) / 2) {
                System.out.println("│" + texto + " ".repeat(largura - texto.length() - 2) + "│");
            } else {
                System.out.println("│" + " ".repeat(largura - 2) + "│");
            }
        }
        System.out.println("╰" + "─".repeat(largura - 2) + "╯");
    }

}
