package com;
import java.util.HashSet;
import java.util.Set;
class A{}
		class B{}

public class Hashset{

	public static void main(String[] args) {
	//Set ss =new HashSet();
	HashSet ss =new HashSet();
	int a=10;                 //primitive consider
//	Integer b =new Integer(a);  //converting primitive
	Integer b=10;
	ss.add(b);    //storing. Before storing it is primitive after storing it is object.
	ss.add(20);   //auto-boxing:converting primitive to object
	ss.add(30.30);
	ss.add("kavi");
	ss.add(true);
	A obj1=new A();
	B obj2=new B();
	ss.add(obj1);
	ss.add(obj2);
	System.out.println(ss);

	}

 }
