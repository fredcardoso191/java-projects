import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int valorMaxSaque = 1000;
        int valorSaque = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Valores mínimos de saque: 2 e 4");
            System.out.println("Valor máximo de saque: " + valorMaxSaque);
            System.out.print("Digite o valor de saque: ");
            valorSaque = sc.nextInt();
            if (valorSaque == 0 || valorSaque == 1 || valorSaque == 3 || valorSaque > valorMaxSaque) {
                System.out.println("Digite um valor de saque válido!\n");
            }
        } while (valorSaque == 0 || valorSaque == 1 || valorSaque == 3 || valorSaque > valorMaxSaque);

        Sacar(valorSaque);

        System.out.println("Valor de saque realizado: " + valorSaque);
        System.out.println("Operação finalizada.");

        sc.close();
    }
    public static void Sacar(int valorSaque){
        int[] notas = { 100, 50, 20, 10, 5, 2 };

        for (int nota : notas) {
            if (valorSaque >= nota) {
                System.out.println(valorSaque / nota + " notas de " + nota);
                valorSaque = valorSaque % nota;
            }
        }
    }
}
