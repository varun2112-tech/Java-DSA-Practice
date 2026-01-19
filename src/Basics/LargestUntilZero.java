package Basics;

import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int largest = n;
        while(n!=0){
            n = in.nextInt();
            if(n > largest){
                largest = n;
            }
        }
        System.out.println(largest);
    }
}
