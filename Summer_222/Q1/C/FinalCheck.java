package Summer_222.Q1.C;

public class FinalCheck {
    public static point p = new point(1, 2, 3);

    public void FinalExam() {
        System.out.println("Final is both exam and keyword");
    }

    public static void check() {
        p.x = 3;
        p.y = 4;
        p = new point(2, 3, 4);
    }

    public static void main(String[] args) {
        check();
    }
}
