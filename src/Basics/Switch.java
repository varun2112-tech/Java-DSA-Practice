package Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        /*
        Syntax
        switch(expression){
        //cases
        case one:
        //do something
        break;
        case two:
        //do something
        break;

        default:
        //do something
         */

        //Enhanced switch
        switch (fruit) {
            case "Mango" -> System.out.println("Kings of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Satday");
            case 7 -> System.out.println("Sunday");
        }

        //Nested Switch
        int empID = in.nextInt();
        String department = in.next();
        switch (empID){
            case 1:
                System.out.println("Varun Agarwal");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT Deparment");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department found");
                }
                break;
            default:
                System.out.println("Enter correct EmpId");
        }
    }
}
