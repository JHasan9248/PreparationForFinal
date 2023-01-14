package Summer_222.Q2.A;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
    public static void main(String[] args) {
        try {

            BufferedReader bf =new BufferedReader(new FileReader("/media/jokerjr9248/Workshop/JAVA/PreparationForFinal/src/Doc1.txt"));
            String line;
            int count=0;
            while ((line=(bf.readLine()))!=null)
            {
                count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
