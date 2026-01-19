package Basics;

import java.util.Scanner;

public class ProductSumDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        while(n > 0){
           int rem = n % 10;
           sum = sum+rem;
           product = product*rem;
           n= n / 10;
        }
        int diff = product - sum;
        System.out.println(diff);
    }
}
