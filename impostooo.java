import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de informação
        System.out.println("Nome do funcionario");
        String nome;

        nome = input.nextLine();
        System.out.println("Salario:");
        int salario;

        salario = input.nextInt();

        // Processamento
        if (salario >= 5000) {
            double imposto;

            imposto = salario * 0.2;
            System.out.println("Salario" + imposto + "R$");
        } else {
            double imposto;

            imposto = salario + 0;
            System.out.println("Salario" + imposto + "R$");
        }
    }
}
