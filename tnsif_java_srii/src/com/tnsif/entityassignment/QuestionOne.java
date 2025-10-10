package com.tnsif.entityassignment;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.println("Enter your Full Name with Initial: ");
        String name = sc.nextLine();

        System.out.println("Enter your Roll Number: ");
        String rollNumber = sc.nextLine();

        System.out.println("Enter your Grade: ");
        String grade = sc.nextLine();

        System.out.println("Enter your Percentage: ");
        String percentage = sc.nextLine();

        // Displaying output
        System.out.println("\nSample Output:");
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);

        sc.close();
    }
}
