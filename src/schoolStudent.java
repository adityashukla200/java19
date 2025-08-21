public class schoolStudent extends Student2{
    schoolStudent(int rollNo, String name){
        super(rollNo, name);   //child se parent class ke constructor ko call kar sakte hai
    }
    public void attend_class(){
        System.out.println(name+" is attending class offline");
    }
    public void give_exam(){
        System.out.println(name+" giving exam on pen and paper");
    }

}
