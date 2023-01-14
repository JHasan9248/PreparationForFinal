package Fall_213.Q3;

import java.io.*;

public class SumOfNumber {
    public static void main(String[] args) {
        try {
            BufferedReader bfr = new BufferedReader(new FileReader("/media/jokerjr9248/Workshop/JAVA/PreparationForFinal/src/Numbers.txt"));
            BufferedWriter sw=new BufferedWriter(new FileWriter("SumOfNumber.txt"));
            String line1;
            String line2;
            while ((line1= bfr.readLine())!=null)
            {
                int a=Integer.parseInt(line1);
                line2= bfr.readLine();
                int b=Integer.parseInt(line2);
                int c=a+b;
                sw.write(c+"\n");
            }
            sw.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
