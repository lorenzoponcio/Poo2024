//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        retanguloArredondado ret1 = new retanguloArredondado(15, 5, "1");
        retanguloLinhasDuplas ret2 = new retanguloLinhasDuplas(15, 5, "2");
        retanguloASCII ret3 = new retanguloASCII(15, 5, "3");

        ret1.desenhar();
        ret2.desenhar();
        ret3.desenhar();
    }
}