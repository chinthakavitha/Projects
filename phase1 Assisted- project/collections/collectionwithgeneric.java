package com;
import java.util.ArrayList;
import java.util.List;
public class collectionwithgeneric {

	public static void main(String[] args) {
		//ll allows to store any type of values
//		List ll =new ArrayList();
//		ll.add(10);
//		ll.add(10.11);
//		ll.add("kavi");
//		ll.add(true);
//		Object obj =ll.get(0);
//		Integer i =(Integer)obj;  // down level  or explicit typecasting
//		int n= i.intValue();
//		System.out.println(n);
		 
		     //collection framework with generic
		List<Integer>ll=new ArrayList<Integer>();
		ll.add(10);   //auto-boxing :converting primitive to object
		ll.add(20);
		ll.add(30);
		int n =ll.get(0);  //auto-unboxing:converting object to primitive
		System.out.println(n);

	}

}
