package Summmer_212.Q3;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Jehan",1.7));
        list.add(new Student("Hasan",1.9));
        list.add(new Student("Adib",1.2));
        list.add(new Student("Thor",5.9));
        list.add(new Student("Alex",2.1));
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.height>o2.height)
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
        });
        for(Student std:list)
        {
            System.out.println(std.name+" "+std.height);
        }
    }
}
