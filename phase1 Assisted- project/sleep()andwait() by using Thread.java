package com;
class Abc implements Runnable{
@Override
public void run() {
Thread t =Thread.currentThread();
String name=t.getName();
for(int i=0;i<10;i++) {
	System.out.println(name+""+i);
	try{
	Thread.sleep(1000);
	if(i==5&& name.equals("Ravi")) {
	wait();//i==5and name is kavi we are calling wait() method belong object.
					
}
	if(i==6&& name.equals("Kumar")) {
	notify(); //resume suspended thread if any thread waiting.
					
}
  }catch(Exception e) {}
}
 }
     }
		

public class interthreadcommunication {

	public static void main(String[] args) {
		Abc obj=new Abc();
		Thread t1 =new Thread(obj);
		Thread t2 =new Thread(obj);
		Thread t3 =new Thread(obj);
		t1.setName("Ravi");
		t2.setName("Kumar");
		t3.setName("Ravikumar");
		t1.start();
		t2.start();
		t3.start();
    }
 }
