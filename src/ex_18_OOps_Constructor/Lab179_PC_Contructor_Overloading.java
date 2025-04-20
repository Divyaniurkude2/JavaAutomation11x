package ex_18_OOps_Constructor;

public class Lab179_PC_Contructor_Overloading {
    public static void main(String[] args) {
        Person p1 = new Person("AMIT",97654321,"abc");
        Person p2 = new Person("PRAMOD",98989898,"XYZ");

        Person p3 = new Person();
        p3.name = "Shika";
        System.out.println(p3.name);

        Person p4 = new Person("LUCK", 82342424);
        System.out.println(p4.address);
    }

}

class Person1{
    String name;
    long phone;
    String address;

    Person1(){

    }

    Person1(String name_arg, long phone_arg, String address_arg){
        this.name = name_arg;
        this.address = address_arg;
        this.phone = phone_arg;

    }
    Person1(String name_arg, long phone_arg) {
        this.name = name_arg;
        this.phone = phone_arg;
    }

    void eat(){
        System.out.println(this.name + "is eating");
    }
}