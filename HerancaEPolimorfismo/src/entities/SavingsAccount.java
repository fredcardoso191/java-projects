package entities;

//Classe -final- evita que a classe seja herdada
//Método -final- evita que o método seja sobreposto 
public final class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override //Sobreposição de método
    public final void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Valor do saque excede o limite disponível na conta.");
        } else {
            balance -= amount;
        }
    }
}
