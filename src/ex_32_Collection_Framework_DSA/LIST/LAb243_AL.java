package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class LAb243_AL {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1"); //0
        list.add("2");//1
        list.add("3");//2
        list.add("3");//3
        list.add(4);//4
        list.add(true);//5
        list.add("3");//6

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));
        System.out.println(list);

        System.out.println("_______________");

        for (int i =0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println(list);
    }
}
