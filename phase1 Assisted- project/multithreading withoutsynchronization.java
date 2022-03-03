class Booking implements Runnable{
	int avl=1;
	@Override
	 public void run() {
		Thread t =Thread.currentThread();
		String name=t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}

public class multithreading withoutsynchrinization {

	public static void main(String[] args) {
		Booking b1=new Booking();    //new memory and avl=1
		Thread t1 =new Thread(b1);
		Thread t2 =new Thread(b1);
		Thread t3 =new Thread(b1);
		t1.setName("kavi");
		t2.setName("vinnu");
		t3.setName("kavinnu");
		t1.start();
		t2.start();
		t3.start();
  }
}