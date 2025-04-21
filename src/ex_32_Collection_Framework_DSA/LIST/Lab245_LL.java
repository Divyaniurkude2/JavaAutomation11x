package ex_32_Collection_Framework_DSA.LIST;

import ex_19_OOPs_Inheritance.multilevel_inheritance.Son;

import java.util.LinkedList;

public class Lab245_LL {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("LinkedLis:" + animals);

        //Accessing elements
        System.out.println("First element : " + animals.getFirst());
        System.out.println("Last Element : " + animals.getLast() );

        //Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal : " + animals);

        System.out.println("Size of LinkedList :" + animals.size());
    }
}
