package se.lexicon.rajashree;

import java.util.Scanner;

public class UserName {


    public static void main(String[] args) {

        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the username: ");
        name = in.nextLine();
        System.out.println("Hello  "+name);
    }
}