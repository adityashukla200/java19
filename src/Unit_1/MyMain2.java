package Unit_1;

public class MyMain2 {
    public static void main(String[] args) {
        Student3 st = new Student3(1,"Aditya","C");
        System.out.println(st.rollno);
        System.out.println(st.name);
        st.setGrade("Unit_1.A");    //will change grade to Unit_1.A
        System.out.println(st.getGrade());
    }
}
