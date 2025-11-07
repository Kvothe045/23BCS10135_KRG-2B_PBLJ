// package pack;

class Demo{
    void show1(){
        System.out.println("This is show1 method");
        show2(); // Calling show2 method
    }
    void show2(){
        System.out.println("This is show2 method");
    }

    static void display(){
        System.out.println("This is a static method");
    }
    public static void main(String[] args){
        Demo demo = new Demo();
        demo.show1(); // Calling show1 method
        display(); // Calling static method directly
    }
}