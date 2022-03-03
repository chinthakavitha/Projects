package com;

public class FinallyBlockExample {

public static void main(String[] args) {
try {
int a=10/0;
System.out.println("No Exception");
}catch(Exception e) {
  System.out.println("Catch block");
}finally {
System.out.println("finally block");
}
  System.out.println("normal statement");
}
 }
