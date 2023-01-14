package Spring_221.Q3;

public class CreditCard {
    private double creditLimit;
    private double creditCurrent;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
        creditCurrent=0;
    }
    public void withDraw(double ammount) throws InvalidTxnException
    {
        if(ammount<0)
        {
            throw new InvalidTxnException(ammount);
        }
        if(ammount>creditLimit)
        {
            throw new InvalidTxnException(ammount,creditCurrent,creditLimit);
        }
        creditCurrent+=ammount;
    }
}
