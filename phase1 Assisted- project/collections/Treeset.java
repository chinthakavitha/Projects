package com;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {
		//Set ss =new HashSet();//if we don't need order 
		//Set ss=new LinkedHashSet(); //to get in order
		Set ss=new TreeSet();
		System.out.println("size"+ss.size());
		System.out.println("Empty"+ss.isEmpty());
		ss.add(10); //it will not allow duplicantes
		ss.add(20);
		ss.add(10);
		ss.add(15);
		ss.add(18);
		ss.add(19);
		//ss.add(16.30);// heterogenious value can't store in treeset
		                //treeset is homogenious 
		System.out.println("size"+ss.size());
		System.out.println("Empty"+ss.isEmpty());
		System.out.println(ss);
		System.out.println("remove"+ss.remove(20));
		System.out.println("remove"+ss.remove(100));
		System.out.println(ss);
		System.out.println("search"+ss.contains(10));
		System.out.println("search"+ss.contains(100));
		ss.clear();
		System.out.println("size"+ss.size());
		System.out.println("Empty"+ss.isEmpty());
		
		}
	}
