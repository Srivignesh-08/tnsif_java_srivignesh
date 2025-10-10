package com.tnsif.entityassignment;
import java.util.Scanner;
		
		// Class Circle
		class 	QuestionThree {
		    // Data Members
		    double radius;
		    String colour;

		    // (i) Method to accept input details
		    void getInput() {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Radius of the Circle: ");
		        radius = sc.nextDouble();
		        sc.nextLine(); // Consume newline left by nextDouble()

		        System.out.print("Enter Colour of the Circle: ");
		        colour = sc.nextLine();
		    }

		    // (ii) Method to calculate area and display
		    void calcArea() {
		        double area = Math.PI * radius * radius;
		        System.out.println("\n--- Circle Details ---");
		        System.out.println("Radius: " + radius);

	}

}
