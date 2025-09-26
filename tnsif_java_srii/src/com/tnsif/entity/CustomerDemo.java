package com.tnsif.entity;

public class CustomerDemo {
	public static void main(String[]args) {
		Customer c1=new Customer();
		c1.setId(101);
		c1.setName("srii");
		c1.setCity("chennai");
		System.out.print(c1);
		Customer c2=new Customer();
		c1.setId(102);
		c1.setName("gopal");
		c1.setCity("vpm");
		System.out.println("id:"+c1.getId()+"name:"+c1.getName()+"city:"+c1.getCity());
	}
}
