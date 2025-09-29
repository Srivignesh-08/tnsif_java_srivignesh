package com.tnsif.entityassignment;

public class StdDemo {
    public static void main(String[] args) {
    	StdDetails s1 = new StdDetails();
        s1.setId(101);
        s1.setName("SRII");
        s1.setAge(20);
        s1.setDepartment("CSE");

        StdDetails s2 = new StdDetails();
        s2.setId(102);
        s2.setName("Gopal");
        s2.setAge(21);
        s2.setDepartment("ECE");

        StdDetails s3 = new StdDetails();
        s3.setId(103);
        s3.setName("sharan");
        s3.setAge(22);
        s3.setDepartment("MECH");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
