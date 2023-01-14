package Summer_222.Q4;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Jehan",15,3.8));
        list.add(new Student("Hasan",22,3.9));
        list.add(new Student("Adib",26,3.2));
        Student std=new Student("Hasan",0,0);
        list.add(std);
        if(list.contains(std))
        {
            System.out.println("Find");
        }
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age>o2.age)
                {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });
        for(Student stdd:list)
        {
            System.out.println(stdd.name+" "+stdd.age+" "+stdd.cgpa);
        }

    }
}
