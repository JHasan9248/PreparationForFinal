package Fall_213.Q1.C;

public class AnnonEx {
    public static void main(String[] args) {
        Person engineer=new Person() {
            @Override
            public void introduce() {
                System.out.println("Hello I am a engineer");
            }
        };
        Person doctor=new Person(){
            @Override
            public void introduce() {
                System.out.println("Hello I am a doctor");
            }
        };
        engineer.introduce();
        doctor.introduce();
    }
}
