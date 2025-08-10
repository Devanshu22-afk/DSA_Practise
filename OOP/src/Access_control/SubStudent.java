package Access_control;

import javax.lang.model.element.Name;

public class SubStudent extends Student {
    public SubStudent(String Name,int Rollno,int ID) {
        super(Name,Rollno,ID);
    }
    void Display1(){
        System.out.println();
    }

    public static void main(String[] args) {
        SubStudent s=new SubStudent("Devanshu",303,20);
        s.Display();
    }
}
