public class Student3 {
    int rollno;
    String name;
    private String grade;
    public Student3(int rollno, String name, String grade) {
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(String grade) {     //setter method
        this.grade = grade;
    }

    public String getGrade() {   //getter method
        return grade;
    }
}
