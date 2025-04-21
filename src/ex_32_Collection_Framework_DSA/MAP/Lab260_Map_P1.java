package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab260_Map_P1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // Map is key and value pair
        // name -> divyani
        m1.put("name", "Divyani");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","divyani");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);


        Map m3 = new TreeMap();
        // Map is key - value
        // name : divyani,
        // rollno : 1
        // phone : 9876543210
        m3.put("firstname","divyani");
        m3.put("lastname","urkude");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
        // {phone=987654321, name=pramod, rollno=1}
    }
}
