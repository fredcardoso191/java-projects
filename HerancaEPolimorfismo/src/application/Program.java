package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        /*
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //Upcasting// é converter um objeto da subclasse para superclasse
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //Downcasting// é converter um objeto da superclasse para subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2; //necessário fazer um casting manual
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; //Isso é um erro de lógica, o compilador não detecta isso

        //Para evitar esse erro
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan (Empréstimo)");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update (Atualizado)");
        }
        */

        //Account acc1 = new Account(1001, "Fred", 1000.0);
        //acc1.withdraw(1001.0);
        //System.out.println("Saldo disponível: " + acc1.getBalance());

        //Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        //acc2.withdraw(1200.0);
        //System.out.println("Saldo disponível: " + acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Irineu", 1000.0, 500.0);
        acc3.withdraw(493.0);
        System.out.println("Saldo disponível: " + acc3.getBalance());
    }
}