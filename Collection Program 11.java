package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Program11 {
	public static void main(String[] args) {
	ArrayList <Integer> a=new ArrayList <Integer> ();
	
	     a.add(23);
	     a.add(30);
	     a.add(67);
	     a.add(32);
	     a.add(67);
	     System.out.println(a);
	     
	     Iterator <Integer> itr=a.iterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.hasNext());
	    	 System.out.println(itr.next());
	    	// System.out.println(a.get(6)); //exception
	     }
	     
	}

}