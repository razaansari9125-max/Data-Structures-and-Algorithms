package com.Interface;

public class Interface {
	public  interface Animal {
		 int i=10;
		 
		  public void sound();
		  
	}
	  public static class Dog implements Animal {
		  @Override
		   public void sound()
		  {
			  System.out.println("sound method from child class");
			  
		  }
	  }
	  public static class cat implements Animal {
		  @Override
		  public void sound ()
		  {
			  System.out.println("sound from cat class");
		  }
		  
			
		}
  public static void main(String[] args) {
	Animal a1=new Dog();
	Animal a2=new cat();
	a1.sound();
	a2.sound();
	
  }			

}