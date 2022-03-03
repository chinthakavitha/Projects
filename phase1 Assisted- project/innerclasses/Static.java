// Java Program to Illustrate Static Nested Classes

// Importing required classes
import java.util.*;

// Class 1
// Outer class
class Outer {

	// Method
	private static void outerMethod()
	{

		// Print statement
		System.out.println("inside outerMethod");
	}

	// Class 2
	// Static inner class
	static class Inner {

		public static void display()
		{

			// Print statement
			System.out.println("inside inner class Method");

			// Calling method inside main() method
			outerMethod();
		}
	}
}

// Class 3
// Main class
class Static {

	// Main driver method
	public static void main(String args[])
	{

		Outer.Inner obj = new Outer.Inner();

		// Calling method via above instance created
		obj.display();
	}
}
