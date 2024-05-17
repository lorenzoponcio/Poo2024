//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProgressaoAritmetica aritmetica = new ProgressaoAritmetica(0, 2);
        ProgressaoGeometrica geometrica = new ProgressaoGeometrica(1, 2);
        ProgressaoFibonacci fibonacci = new ProgressaoFibonacci();

        System.out.println("Progressão Aritmética:");
        for (int i = 0; i < 10; i++) {
            System.out.println(aritmetica.proximo() + " ");
        }
        aritmetica.reiniciar();
        System.out.println("\nApós reiniciar:");
        for (int i = 0; i < 10; i++) {
            System.out.println(aritmetica.proximo() + " ");
        }

        System.out.println("\n\nProgressão Geométrica:");
        for (int i = 0; i < 10; i++) {
            System.out.println(geometrica.proximo() + " ");
        }
        geometrica.reiniciar();
        System.out.println("\nApós reiniciar:");
        for (int i = 0; i < 10; i++) {
            System.out.println(geometrica.proximo() + " ");
        }

        System.out.println("\n\nProgressão Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci.proximo() + " ");
        }
        fibonacci.reiniciar();
        System.out.println("\nApós reiniciar:");
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci.proximo() + " ");
        }
    }
}


//Professor não entendi muito bem o final, se era pra repetir do zero ou pegar outro número
