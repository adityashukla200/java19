package Unit_3.sorting_roll_no;

import java.util.ArrayList;
import java.util.Collections;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<Student> stobj = new ArrayList<>();
        stobj.add(new Student(21,"Aditya", 100));
        stobj.add(new Student(20,"Aman", 101));
        stobj.add(new Student(19,"Alok", 102));
        stobj.add(new Student(23,"Harsh", 103));
        stobj.add(new Student(24,"Gyan", 104));
        stobj.add(new Student(21,"Ramesh", 105));
        Collections.sort(stobj);
        for(Student st : stobj){
            System.out.println("Name "+st.name+" Age "+st.age+" Roll_no "+st.roll_no);
        }
    }

}
