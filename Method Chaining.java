package com.methodChaining;

public class Gun {
	int id;
	String name;
	int bullet;
	
	public Gun setValue(int id, String name, int bullet)
	{
		this.id=id;
		this.name=name;
		this.bullet=bullet;
		return this;
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(bullet);
	}
	public static void main(String[] args) 
	{
		Gun g=new Gun();
		g.setValue(21, "AK47", 6);
		g.display();
		
	}

}