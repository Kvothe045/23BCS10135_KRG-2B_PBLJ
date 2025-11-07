
// File: NOTES_CODES/PBLJ/CODES/access.java
public class Access {
    public void methodA() {
        System.out.println("Method A in Class A");
    }
    public static void main(String[] args) {
        Access access = new Access();
        access.methodA();
        ClassB classB = new ClassB();
        classB.display();
    }
}

class ClassB {
    void display() {
        System.out.println("Display method in Class B");
    }

    static void main(String[] args) {
        System.out.println("Main method in Class B");
    }
}