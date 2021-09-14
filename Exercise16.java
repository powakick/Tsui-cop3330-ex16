/*
UCF COP3330 FALL 2021 ASSIGNMENT 16 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int legal = 16;
        int age;
        System.out.println("What is your age?");
        age = scan.nextInt();

        if (age >= 16) {
            System.out.println("You are old enough to legally drive.");

        }
        if (age <= 16) {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
