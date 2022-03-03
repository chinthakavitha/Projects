package com;
    // Java program to illustrate the concept
	// of classes and objects

	// Class Declaration

public class ObjectAndClass{
   // Instance Variables
   String name;
   int age;
		// Constructor Declaration of Class
  public ObjectAndClass(String name,int age)
{
	this.name = name;
	this.age = age;
}
    // method 1
   public String getName()
{
	return name;
	}
    //method 2
   public int getAge()
	{
	return age;
}
 @Override
    public String toString()
  {
	 return ("dog name is " + this.getName()+"\n dog age is " +this.getAge());
 }
      public static void main(String[] args)
		{
			ObjectAndClass obj =new ObjectAndClass("puppy",15);
			System.out.println(obj.toString());
		}
	}



