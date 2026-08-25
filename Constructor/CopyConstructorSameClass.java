class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Original object
        Student s1 = new Student("John", 20);

        // Copy object using copy constructor
        Student s2 = new Student(s1);

        System.out.println("Original Object:");
        s1.display();

        System.out.println("\nCopied Object:");
        s2.display();
    }
}
