package org;

public class Car {
	String brand;
	int cost;
	Car(String brand)
	{
		this.brand=brand;
	}
	Car(String brand,int cost)
	{
		this(brand);
		this.cost=cost;
	}

	public static void main(String[] args) {
		Car c=new Car("Thar",1600000);
		System.out.println(c.brand);
		System.out.println(c.cost);
		
	}
}
