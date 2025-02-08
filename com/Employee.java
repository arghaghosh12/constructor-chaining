package com;

class Employee {
	Employee(int id)
	{
		this(20,"Tom");
		System.out.println("id is: "+ id);
	}

	Employee(int age,String name)
	{

		System.out.println("Age : "+ age +" Name: "+ name);
	}

	Employee(double salary)
	{
		this(101);
		System.out.println("salary: "+salary);
	}
	public static void main(String[] args) {
		Employee e=new Employee(3.5);
	}

}
