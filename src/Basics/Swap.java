package Basics;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " "+ b);
    }
    static void swap(int num1, int num2){
        //swap numbers code
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this change will only be valid in this function scope only.
    }
}
