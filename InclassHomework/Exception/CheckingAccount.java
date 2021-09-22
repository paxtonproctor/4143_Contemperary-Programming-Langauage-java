package InclassHomework.Exception;

public class CheckingAccount {
    double balance;
    int accNumber;

    public CheckingAccount(int myAccNumber){
        accNumber = myAccNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double myBalance){
        balance = myBalance;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }
        else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public void deposit(double amount){
        balance += amount;
    }
}
