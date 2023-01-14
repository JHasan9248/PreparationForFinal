package Spring_211.Q4.B;

public class BankAccount {
    double balance;
    public BankAccount() {
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    void updateBalace(double newBalance)
    {
        balance+=newBalance;
    }

    public static void main(String[] args) {
        BankAccount account=new BankAccount(){
            @Override
            void updateBalace(double newBalance) {
                System.out.println("The balace has been updated");
            }
        };
        account.updateBalace(Integer.parseInt("0"));
        account.updateBalace(0);
    }
}
