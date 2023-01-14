package Spring_211.Q2.A;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] data=new int[10];
        try{
            for(int i=0;i< data.length;i++)
            {
                int a=s.nextInt();
                int b=s.nextInt();
                int c=s.nextInt();
                data[a]=b/c;
            }
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Done");
        }
    }
}
