package com.tnsif.entityassignment;

public class StdDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Vignesh");
        s1.setAge(20);
        s1.setDepartment("CSE");

        Student s2 = new Student();
        s2.setId(102);
        s2.setName("Sridhar");
        s2.setAge(21);
        s2.setDepartment("ECE");

        Student s3 = new Student();
        s3.setId(103);
        s3.setName("Gopal");
        s3.setAge(22);
        s3.setDepartment("MECH");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
