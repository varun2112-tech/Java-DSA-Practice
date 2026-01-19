package Basics;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = in.nextInt();
        int sum = n;
        while (n!=0){
            n = in.nextInt();
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
