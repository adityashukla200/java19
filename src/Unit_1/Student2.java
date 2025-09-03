package Unit_1;

public abstract class Student2 {
    int rollNo;
    String name;
    Student2(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    abstract void attend_class();
    abstract void give_exam();
    void register(){

        System.out.println("Name is "+name+" is registered successfully with rollNo="+rollNo);

    }

}
