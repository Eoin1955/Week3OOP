package ie.atu.week3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //methods
        System.out.println("Please enter number 1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Please enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter operator: ");
        String op = sc.next();

        switch(op) {
            case "add": add(a, b);break;
            default: System.out.println("Invalid operator");break;
        }

    }

    public static void add(int a,int b) {
        int sum = a+b;
        System.out.println("The sum is: " + sum);
    }
}
