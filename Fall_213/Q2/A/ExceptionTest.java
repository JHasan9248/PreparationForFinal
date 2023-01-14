package Fall_213.Q2.A;

public class ExceptionTest {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        try{
            obj.devide();
            obj.displayNameLength();
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
