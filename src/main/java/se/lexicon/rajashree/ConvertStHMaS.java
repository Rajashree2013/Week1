package se.lexicon.rajashree;
import java.util.Scanner;
public class ConvertStHMaS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        int t1 = seconds % 60;
        int t2 = seconds / 60;
        int t3 = t2 % 60;
        t2 = t2 / 60;
        System.out.print(t2 + ":" + t3 + ":" + t1);
        System.out.print("\n");


    }
}
