package InclassHomework.Exception;

public class BankDemo {
    public static void main(String[] args){
        CheckingAccount obj1 = new CheckingAccount(40005);
        System.out.println("Depositing....");
        obj1.deposit(100000);
        try{
            System.out.println("withdrawing.. $100");
            obj1.withdraw(100);

            System.out.println("withdrawing.. $1,000,000");
            obj1.withdraw(1000000);
        }
        catch(InsufficientFundsException e){
            System.out.println("Sorry! you a bum of " + e.getAmount());
            e.printStackTrace();
        }
        finally{
            System.out.println("Come later");
        }
    }
}
