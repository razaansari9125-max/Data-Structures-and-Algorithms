package com.encapsulation;

public class Car {
	private int id;
	private String name;
	//setting method
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	//getting method
	public int getId() 
	{
		return id;
}
	public String getName()
	{
		return name;
	}
	public static void main(String[] args)
	{
		Car c=new Car();
		c.setId(12);
		c.setName("suzuki");
		System.out.println(c.getId()); //12
		System.out.println(c.getName()); //suzuki
	}
}