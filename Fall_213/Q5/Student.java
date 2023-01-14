package Fall_213.Q5;

public class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public Student(String name) {
        this.name = name;
        id=-1;
        cgpa=-1;
    }
}
