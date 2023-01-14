package Summmer_212.Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String promo=s.next();
        CartManager sm=new CartManager();
        sm.addIteam(new CartIteam("Burger",160));
        sm.addIteam(new CartIteam("Pizza",140));
        try{
            if(!(promo.equals("HELLO100") || promo.equals("ENJOY50")))
            {
                throw new InvalidPromoCodeException(promo);
            }
            if(promo.equals("HELLO100") && (sm.getTotalPrice()<500))
            {
                throw new InvalidPromoCodeException("HELLO100", sm.getTotalPrice());
            }
            if(promo.equals("ENJOY50") && (sm.getTotalPrice()<250))
            {
                throw new InvalidPromoCodeException("ENJOY50", sm.getTotalPrice());
            }
        }catch (InvalidPromoCodeException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(sm.getTotalPrice());

    }

}
