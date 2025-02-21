import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Consultar o salario");

        // Declaração variaveis
        double s;
        String n;

        // Entradas
        System.out.println("Informe seu nome ");
        n = input.nextLine();
        System.out.println("Informe o Salario R$");
        s = input.nextDouble();

        // Processamento
        if (s >= 5000) {
            System.out.println("Pagara a taxa de 20%");
            System.out.println(s - s * 0.8);
        } else {
            System.out.println("Não vai pagar a taxa de 20%");
        }
    }
}
