package com.tcf.encapsulation;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setName("banumathi");
		c1.setCity("pondicherry");
		System.out.println(c1);
		
		Customer c2 = new Customer();
		c2.setCid(102);
		c2.setName("praveen");
		c2.setCity("Auroville");
		
		System.out.println(c2);
		Customer c3 = new Customer();
		c3.setCid(103);
		c3.setName("Narasiman");
		c3.setCity("chennai");
		System.out.println(c3);
		

	}

	public CustomerDemo() {
		super();
	}

}
