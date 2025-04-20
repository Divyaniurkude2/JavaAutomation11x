package ex_18_OOps_Constructor;

public class Lab174_Example2 {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
    }
}
class WebAutomation{
    WebAutomation(){
        System.out.println("I am to read a CSV File");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything which you want to do, when Object is created");
        //FileInputStream fileInputStream = new FileInputStream("C://a.txt);
    }
}
