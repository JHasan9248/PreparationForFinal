package Summmer_212.Q5;

import java.util.ArrayList;

public class CartManager {
    ArrayList<CartIteam> iteams;
    CartManager(){
        iteams=new ArrayList<>();
    }
    public void addIteam(CartIteam iteam)
    {
        iteams.add(iteam);
    }
    public double getTotalPrice()
    {
        double sum=0;
        for(CartIteam item:iteams)
        {
            sum+=item.price;
        }
        return sum;
    }
}
