package Summer_222.Q2.B;

public class ExceptionDemo {
    void iserCheck(int age,int work_experience) throws InvalidUserException
    {
        if(age<50)
        {
            throw new InvalidUserException("Ineligible for Elderly pension because of age");
        }
        if(work_experience<20)
        {
            throw new InvalidUserException("Ineligible for Elderly pension because of work experience");
        }
    }
}
