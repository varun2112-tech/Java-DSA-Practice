package Basics;

public class Greeting {
    public static void main(String[] args) {
        greeting();
        String personalized = myGreet("Varun");
        System.out.println(personalized);
    }
    static void greeting(){
        System.out.println("Hello world");
    }

    static String myGreet(String name){
        String message = "Hello"+name;
        return message;
    }
}
