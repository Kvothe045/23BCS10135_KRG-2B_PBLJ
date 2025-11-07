public class Overload{
    void show(int num){
        System.out.println("Overloaded method with int: " + num);
    }

    String show(String name){
        System.out.println("Overloaded method with String:");
        return "Ary";
    
    }

    void show(int num, String name){
        System.out.println("Overloaded method with int and String: " + num + ", " + name);
    }

    public static void main(String[] args) {
        Overload demo = new Overload();
        // demo.show(10); // Calls the method with int parameter
        // demo.show("Hello"); // Calls the method with String parameter
        // demo.show10,"aryan");
        demo.show(10, "Aryan"); // Calls the method with int and String parameters
    }
}