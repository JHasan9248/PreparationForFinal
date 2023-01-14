package Summmer_212.Q4;

import java.io.*;

public class ImportantLineFineder {
    public static void main(String[] args) {
        try{
            BufferedReader bfr=new BufferedReader(new FileReader("/media/jokerjr9248/Workshop/JAVA/PreparationForFinal/src/line.txt"));
            BufferedWriter bfw=new BufferedWriter(new FileWriter("ImportantLine.txt"));
            String line;
            String[] tukraLine=new String[2];
            while ((line= bfr.readLine())!=null)
            {
                tukraLine=line.split("-");
                int a=Integer.parseInt(tukraLine[0]);
                int b=Integer.parseInt(tukraLine[1]);
                if(a/1000!=0 || b/1000!=0)
                {
                    bfw.write(line+"\n");
                }
            }
            bfw.close();

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
