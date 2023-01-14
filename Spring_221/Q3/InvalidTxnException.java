package Spring_221.Q3;

public class InvalidTxnException extends Exception{
    InvalidTxnException(double d1)
    {
        super(d1+" is not a valid amount for the requested transaction");
    }
    InvalidTxnException(double d1,double d2,double d3)
    {
        super(d1 +" cannot be withdrawn with current credit of "+d2+" for your limit of "+d3);
    }
}
