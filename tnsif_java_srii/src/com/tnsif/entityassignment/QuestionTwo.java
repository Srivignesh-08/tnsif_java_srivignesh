package com.tnsif.entityassignment;

import java.util.Scanner;

class QuestionTwo {
	 public static void main(String[] args)
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    String name, address, phone;
    double sales_amount, commission;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        sales_amount = sc.nextDouble();
    }

    void calculateCommission() {
        if (sales_amount >= 100000)
            commission = sales_amount * 0.10;
        else if (sales_amount >= 50000)
            commission = sales_amount * 0.05;
        else if (sales_amount >= 30000)
            commission = sales_amount * 0.03;
        else
            commission = 0.0;
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Commission Earned: " + commission);
    }
}

public class QuestionTwo {
    public static void main(String[] args) {
        Student s = new Student();
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
        c.displayDetails();
    }
}
