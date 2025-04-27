package Tasks.Encapsulation_4thApril;

public class Array_Of_ATB_Student {
    public static void main(String[] args) {
        ATB[] students = new ATB[3];

        students[0] = new ATB("Divyani", 25, "Java Full Stack");
        students[1] = new ATB("Sejal", 23, "Java Developer");
        students[2] = new ATB("Ram", 22, "HR");

        for(ATB student : students) {
            System.out.println(student);  // toString() method automatically called
        }
    }
}
