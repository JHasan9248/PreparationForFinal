package Spring_211.Q1;

import java.io.*;

public class FileManager {
    public static void main(String[] args) {
        try{
            BufferedReader bfr=new BufferedReader(new FileReader("/media/jokerjr9248/Workshop/JAVA/PreparationForFinal/src/Doc3.txt"));
            BufferedReader bfr2=new BufferedReader(new FileReader("/media/jokerjr9248/Workshop/JAVA/PreparationForFinal/src/Doc3.txt"));
            BufferedWriter bfw=new BufferedWriter(new FileWriter("LastFiveLine.txt"));
            String line1;
            String line2;
            int n=0,m=0;
            while ((line1= bfr.readLine())!=null)
            {
                n++;
            }
            while ((line2= bfr2.readLine())!=null)
            {
                m++;
                if(m>n-5)
                {
                    bfw.write(line2+"\n");
                }
            }
            bfw.close();

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
