package Tasks;

public class Task016_April01st_OOPs_Person {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.printDetails();
        p1.eat();

        Person2 p2 = new Person2("Divyani", 25, "Pune", "987654321", true);
        p2.printDetails();
        p2.eat();

        Person2 p3 = new Person2("Rohan", 30, true);
        p3.walk();
        p3.doHome();
        p3.sleep();
    }
}
class Person2 {
    String name;
    int age;
    String address;
    String phone;
    boolean isFemale;


    Person2(){
        name = "Divyani";
        age = 0;
        address = "Pune";
        phone = "N/A";
        isFemale = true;
    }

    public Person2(String name, int age, String address, String phone, boolean isFemale) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.isFemale = isFemale;
    }

    public Person2(String name, int age, boolean isFemale) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
    }
    void eat(){
        System.out.println(name + "is eating.");
    }
    void sleep() {
        System.out.println(name + "is Sleeping.");
    }
    void walk() {
        System.out.println(name + " is Walking");
    }
    void doHome() {
        System.out.println(name + "is doing homework/housework.");
    }

    public  void  printDetails() {
        System.out.println("------Person Details");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Address :" + address);
        System.out.println("Phone :" + phone);
        System.out.println("Gender :" + (isFemale ? "Male" : "Female"));
    }
}
