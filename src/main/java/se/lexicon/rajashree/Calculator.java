package se.lexicon.rajashree;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {


        Double num1, num2, sumResult,subResult,mulResult,divResult;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);



        // ask users to enter numbers
        System.out.println("Enter first number");
        num1 = input.nextDouble();

        System.out.println("Enter second number");
        num2 = input.nextDouble();

        sumResult = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sumResult);



        subResult = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + subResult);



        mulResult = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + mulResult);



        divResult = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + divResult);

    }
}































