package Fall_193.Q2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeManager {
    public static void main(String[] args) {
        try{
            ArrayList<Employee> list=new ArrayList<>();
            BufferedReader bfr=new BufferedReader(new FileReader("/media/jokerjr9248/Workshop/JAVA/PreparationForFinal/src/Employee.txt"));
            BufferedWriter bfw=new BufferedWriter(new FileWriter("HighSal.txt"));
            String line;
            String[] lineSplit=new String[3];
            while ((line= bfr.readLine())!=null)
            {
                lineSplit=line.split(" ");
                list.add(new Employee(Integer.parseInt(lineSplit[0]),lineSplit[1],Double.parseDouble(lineSplit[2])));
            }
            list.sort(new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if(o1.salary>o2.salary)
                    {
                        return -1;
                    }
                    else
                    {
                        return 1;
                    }
                }
            });
            bfw.write(list.get(0).name+" "+list.get(0).id+" "+list.get(0).salary);
            bfw.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
