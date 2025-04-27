package Tasks;

public class Task015_March31th_OOPs_AllFourTypesOfMethod_Person {
    public static void main(String[] args) {
        Person p= new Person("Divyani", 25, "Female");

        p.displayInfo();
        p.email = "divyani@gmail.com";
        System.out.println("Email:" + p.getEmail());

        p.updateAddress("Nagpur, Maharashtra");

        double bmi = p.calculateBMI(1.65,58);
        System.out.println("BMI:" + bmi);
    }
}

class Person{
    String name;
    int age;
    String gender;
    String address;
    String phoneNumber;
    String email;
    String nationality;
    String occupation;
    double height;
    double weight;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    //Method without parameters and without return type
    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
    }

    //Method without parameters but with return type
    public String getEmail(){
        return email;
    }

    //Method with parameters and without return type
    public void updateAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address update to:" + address);
    }

    //Method with parameters and with return type
    public double calculateBMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
        return  weight/(height * height);

}
}




//    public static void main(String[] args) {
//        person p1 = new person();
//        p1.sleep();
//        p1.married();
//        p1.greet_with_details("Divyani", 24, 100);
//        p1.person_name("Ram");
//    }
//}
//class  person{
//    String name;
//    String mobile_no;
//    double weight;
//    float height;
//    int legs;
//    double salary;
//    byte age;
//    String color_eyes;
//    boolean isMale;
//    boolean ismarried;
//
//    void sleep(){
//        System.out.println("Person is sleeping");
//    }
//    boolean married(){
//        ismarried = true;
//        System.out.println("Is married " +ismarried);
//        return ismarried;
//    }
//    void greet_with_details(String name, int age, double salary) {
//        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
//    }
//    String person_name(String name){
//        System.out.println("Name is " +name);
//        return name;
//    }
//
//}