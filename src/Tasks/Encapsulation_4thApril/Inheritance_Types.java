package Tasks.Encapsulation_4thApril;

public class Inheritance_Types {
    public static void main(String[] args) {
        // Single Inheritance Example
        Dog dog = new Dog();
        dog.eat();    // from Animal
        dog.bark();   // from Dog

        System.out.println();

        // Multilevel Inheritance Example
        Puppy puppy = new Puppy();
        puppy.eat();   // from Animal
        puppy.bark();  // from Dog
        puppy.weep();  // from Puppy

        System.out.println();

        // Hierarchical Inheritance Example
        Cat cat = new Cat();
        cat.eat();    // from Animal
        cat.meow();   // from Cat
    }
}

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// ---- Single Inheritance ----
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// ---- Multilevel Inheritance ----
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}

// ---- Hierarchical Inheritance ----
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}
