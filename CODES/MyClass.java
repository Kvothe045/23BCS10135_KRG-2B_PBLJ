public class MyClass {
    int x;
    static int y;

    void show(){
        x = x+1;
        y = y+1;
        System.out.println("x: " + x + ", y: " + y);
    }
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        
        obj1.show(); // x: 1, y: 1
        obj2.show(); // x: 1, y: 2
        
        MyClass obj3 = new MyClass();
        obj3.show(); // x: 1, y: 3
    }
}

//EXPLANATION:
// In this code, 'x' is an instance variable, and 'y' is a static variable.
// Each instance of MyClass has its own 'x', but they share the same 'y'.
// When obj1 calls show(), it increments its own 'x' and the shared 'y'.
// When obj2 calls show(), it increments its own 'x' (which is still 1) and the shared 'y' again.
// obj3 also increments the shared 'y', but its own 'x' remains 1 since it's a new instance.
// This demonstrates the difference between instance and static variables in Java.
// The output will show how 'x' remains 1 for each instance, while 'y' increments across all instances.
// The main method creates three instances of MyClass and calls the show method on each, demonstrating
// how instance and static variables behave differently.    