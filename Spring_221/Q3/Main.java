package Spring_221.Q3;

public class Main {
    public static void main(String[] args) {
        try {
            CreditCard c1 = new CreditCard(-500);
            CreditCard c2 = new CreditCard(10000);
            c2.withDraw(12000);
            c2.withDraw(4000);
        }catch (InvalidTxnException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
