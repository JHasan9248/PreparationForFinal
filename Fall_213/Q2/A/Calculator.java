package Fall_213.Q2.A;

import java.util.Scanner;

public class Calculator {
    String name=null;
    int num1;
    int num2;
    Calculator()
    {
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();
    }
    void devide()
    {
        System.out.println(num1/num2);
    }
    void displayNameLength()
    {
        System.out.println(name.length());
    }
}
