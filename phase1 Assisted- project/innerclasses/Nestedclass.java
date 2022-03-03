we have 4 types of inner classes 1.nested inner class 2.method local inner class3.static nested
//4.Anonymous inner class

package com;
//Java Program to Demonstrate Nested class

//Class 1
//Helper classes
class Outer {

	// Class 2
	// Simple nested inner class
	class Inner {

		// show() method of inner class
		public void show()
		{

			// Print statement
			System.out.println("In a nested class method");
		}
	}
}

//Class 2
//Main class
class  Nestedclass {

	// Main driver method
	public static void main(String[] args)
	{

		// Note how inner class object is created inside
		// main()
		Outer.Inner in = new Outer().new Inner();

		// Calling show() method over above object created
		in.show();
	}
}
