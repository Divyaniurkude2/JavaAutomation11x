package ex_27_Static;

public class Lab208_REAl {
    public static void main(String[] args) {
        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);

        ATB.doAssignment();
        ATB.joinZoomForClass();

        ATB amit = new ATB();
        amit.setName("amit");
        amit.setPhone("5695764569");

        ATB ram = new ATB();
        ram.setName("ram");
        ram.setPhone("988765456");

    }
}
class ATB{
    static {
        System.out.println("Load the class ?, I will Execute");
    }

    {
        System.out.println("IIB - this is called when object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private String phone;
    static String courseName = "ATB11x";
    static String mentorName = "Divyani";

    static  void doAssignment(){
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void howTheyAssignment(){
        System.out.println("It is different!");
    }
}