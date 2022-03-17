import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        System.out.println("Informe seu nome e sobrenome: ");
        String informaNome = sc.nextLine();
        cliente.setNome(informaNome);

        System.out.println("Digite o valor de depósito: ");
        double valor = sc.nextDouble();
        cc.deposito(valor);

        System.out.println("Digite o valor de transferencia para Conta Poupança: ");
        valor = sc.nextDouble();
        cc.transferencia(valor, cp);

        if(valor > cc.saldo) {
            System.out.println("Saldo indisponivel");
            main(args);
        }

        System.out.println("Deseja realizar um saque (1- Sim / 0- Nao)? ");
        int decisao = sc.nextInt();

        if(decisao == 1){
            System.out.println("Digite o valor de saque da Conta Corrente: ");
            valor = sc.nextDouble();
            cc.saque(valor);

            cc.imprimirExtrato();
            cp.imprimirExtrato();
            System.out.printf("\nValor de Saque: %.2f", valor);
        } else if(decisao == 0){
            cc.imprimirExtrato();
            cp.imprimirExtrato();
        } else {
            System.out.println("Digite um valor valido");
            main(args);
        }

        sc.close();
    }
}