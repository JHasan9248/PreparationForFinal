package Summer_222.Q2.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ExceptionDemo obj=new ExceptionDemo();
        int age=s.nextInt();
        int workExperience=s.nextInt();
        try{
            obj.iserCheck(age,workExperience);
        }catch (InvalidUserException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
