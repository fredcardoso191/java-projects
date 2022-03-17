package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //Saque com taxa
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Valor de saque excede o limite disponível na conta.");

        } else {
            balance -= amount + 5.0;
        }
    }

    //Deposito
    public void deposit(double amount){
        balance += amount;
    }

}
