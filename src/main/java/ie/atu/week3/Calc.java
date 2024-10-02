package ie.atu.week3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //methods
        System.out.println("Please enter number 1: ");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        System.out.println("Please enter number 2: ");
        float num2 = sc.nextFloat();
        System.out.println("Please enter operator: ");
        String op = sc.next();


        switch(op) {
            case "add": add((int) num1, (int)num2);break;

            case "subtract": subtract((int) num1, (int)num2);break;

            case "multiply": multiply((int) num1, (int)num2);break;

            case "divide": divide(num1, num2);break;

            default: System.out.println("Invalid operator");break;
        }

    }

    public static void add(int a,int b) {
        int sum = a+b;
        System.out.println("The sum is: " + sum);
    }
    public static void subtract(int a,int b) {
        int sum = a-b;
        System.out.println("The sum is: " + sum);
    }

    public static void multiply(int a,int b) {
        int sum = a*b;
        System.out.println("The sum is: " + sum);
    }

    public static void divide(float a,float b) {

        if(b==0){
            System.out.println("Division by zero");
            return;
        }
        else {
            float sum = a/b;
            System.out.println("The sum is: " + sum);
        }
    }
}
