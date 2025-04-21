package ex_32_Collection_Framework_DSA.MAP;

import java.util.*;

public class Lab262_REAL_EXAMPLE {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("name", "Divyani");
        student1.put("phone", "987654321");
        student1.put("address1", "MP");
        student1.put("address2", 123);

        Map<String,Object> student2 = new HashMap();
        student2.put("name", "Ram");
        student2.put("phone", "987654321");
        student2.put("address1", "HP");
        student2.put("address2", 345);


        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        System.out.println(student1);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic habit");
        book_read_items.add("Atomic habit");
        book_read_items.add("Eat the frog");

    }
}
