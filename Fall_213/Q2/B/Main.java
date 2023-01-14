package Fall_213.Q2.B;

public class Main {
    public static void main(String[] args) {
        try{
            int acc[]={100,101,102,103,104,105};
            double balace[]={2000,1500,900,1560,1765.5};
            for(int i=0;i<5;i++)
            {
                if(balace[i]<1000)
                {
                    throw new MinimumBalaceException("balace is low");
                }
            }
        }catch (MinimumBalaceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
