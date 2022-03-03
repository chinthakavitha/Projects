package com;
import java.awt.List;
import java.util.Stack;
import java.util.ArrayList;
public class Listexample {

	public static void main(String[] args) {
		Stack ss =new Stack();
		ss.push(100);  //just like add method or push
       	ss.push(200);
		ss.push(300);
		System.out.println(ss);
		System.out.println("top most remove"+ss.pop()); //remove from stack
		System.out.println(ss);
		System.out.println("only view most element"+ss.peek()); //it only retrive
		System.out.println(ss);
}
}