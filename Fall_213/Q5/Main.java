package Fall_213.Q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Jehan",3,3.88));
        list.add(new Student("Hasan",2,3.5));
        list.add(new Student("Adib",1,3.88));
        list.add(new Student("Sifat",41,3.9));
        list.add(new Student("Ahmed",7,3.75));
        list.add(new Student("Thor",15,3.89));
        if(list.contains(new Student("Adib",1,3.88)))
        {
            System.out.println("Object have been find");
        }
        for(Student st:list)
        {
            System.out.println(st.name+" "+st.id+" "+st.cgpa);
        }
        System.out.println();
        list.sort(new Comparator<Student>() {  //sort cgpa
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.cgpa>o2.cgpa)
                {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });
        for(Student st:list)
        {
            System.out.println(st.name+" "+st.id+" "+st.cgpa);
        }
        System.out.println();
        Collections.sort(list, new Comparator<Student>() { //sort name
            @Override
            public int compare(Student stu1, Student stu2) {
                return stu1.name.compareToIgnoreCase(stu2.name);
            }
        });
        for(Student st:list)
        {
            System.out.println(st.name+" "+st.id+" "+st.cgpa);
        }

    }
}
