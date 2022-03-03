package com;
import java.util.ArrayList;
public class validationofEmail-Id {
	public static void main(String[] args) {
	  ArrayList<String> emailID = new ArrayList<String>();
	    emailID.add("sita123@gamil.com");
	    emailID.add("ravikiranreddy@gmail.com");
	    emailID.add("Githaguma@gamil.com");
	    emailID.add("lahari1999@gamil.com");
	    emailID.add("snehalathareddy@gmail.com");
	    emailID.add("subramanaya09@gmail.com");
	    emailID.add("sabine.neuwirth@gmx.com");
	        
  String searcElement = "subramanaya09@gmail.com";
  for(int i=0; i<emailID.size(); i++) 
  {
     System.out.println(emailID.get(i));
     if(searcElement==emailID.get(i)) 
     {
        System.out.println("\n");
	  System.out.println("email ID " + searcElement + " found");
	  break;
        }
     }              
  }                  
}                        
	                   
	    


		
	