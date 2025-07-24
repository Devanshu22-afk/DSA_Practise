package Access_control;

public class Student {
    public String name;
    protected  int Rollno;
    private int ID;

    public Student(String name,int rollno, int ID) {
        this.name = name;
        this.Rollno = rollno;
        this.ID = ID;

    }

    public  void Display(){
        System.out.println(name);
        System.out.println(Rollno);
        System.out.println(ID);
    }

}
