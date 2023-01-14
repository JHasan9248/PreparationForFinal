package Summmer_212.Q5;

public class InvalidPromoCodeException extends Exception{
    InvalidPromoCodeException(String str)
    {
        super(str+" is the wrong promo code");
    }
    InvalidPromoCodeException(String  str,double price)
    {
        super(str+" cannot be applied for order price of "+price);
    }
}
