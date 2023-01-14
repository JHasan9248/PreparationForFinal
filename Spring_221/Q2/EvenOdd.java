package Spring_221.Q2;

import java.io.*;

public class EvenOdd {
    public static void main(String[] args) {
        try{
            BufferedReader bfr=new BufferedReader(new FileReader("/media/jokerjr9248/Workshop/JAVA/PreparationForFinal/src/id.txt"));
            BufferedWriter odd=new BufferedWriter(new FileWriter("Odd.txt"));
            BufferedWriter even=new BufferedWriter(new FileWriter("Even.txt"));
            String line;
            while ((line=bfr.readLine())!=null)
            {
                int a=Integer.parseInt(line);
                if(a%2==0)
                {
                    even.write(line+"\n");
                }
                else {
                    odd.write(line+"\n");
                }
            }
            even.close();
            odd.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        }
}
