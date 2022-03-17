package entities;

/*
* A classe BusinessAccount vai ter todos os dados e comportamentos da classe Account
* Isso através do extends
 */
public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override //Sobreposição do método
    public void withdraw(double amount) {
        double fee = 2.0;
        if (amount > balance) {
            System.out.println("Valor do saque excede o limite disponível na conta.");
        } else {
            super.withdraw(amount);
            balance -= fee;
        }

        if ((amount + fee + 5.0) > loanLimit) {
            System.out.println("Valor excede limite do saque.");
            System.exit(0);
        }
    }
}
