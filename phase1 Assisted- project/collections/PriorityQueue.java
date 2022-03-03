package com;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
public class PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue pq =new PriorityQueue();
	//	Queue pq =new PriorityQueue();   //if we want queue 
		pq.add(3);
		pq.add(1);
		pq.add(2);
		pq.add(5);
		System.out.println(pq);
		System.out.println("remove elements "+pq.poll());
		System.out.println(pq);
		System.out.println("remove elements "+pq.poll());
		System.out.println(pq);
		Queue lq=new LinkedList();
		lq.add(3);
		lq.add(1);
		lq.add(5);
		lq.add(2);
		System.out.println(lq);
		System.out.println("remove elements "+lq.poll());
		System.out.println(lq);
		System.out.println("remove elements "+lq.poll());
		
		
		

	}

}