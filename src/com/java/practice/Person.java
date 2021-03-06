package com.java.practice;

// This is to understand the order of static methods
// this is my final push on person
public class Person {
	
	{
		personCount = 10;
		System.out.println("non static something");
	}
	static {
System.out.println(Person.personCount + "before initialization");
		personCount = 20;
		System.out.println(Person.personCount + "something");
	}
	static int personCount = 1000;
	{
		
		personCount = 30;
		System.out.println("non static somthing else");
	}
	static {
		System.out.println(Person.personCount + "after initialization");
		personCount = 40;
		System.out.println(Person.personCount + "something else");
	}
	
// can initialize variables before using them 
	public static void main(String[] args) {
		
		System.out.println(Person.personCount); // Line A

		Person p = new Person();// Line B reads the non static lines
		
		
		System.out.println(Person.personCount);// Line C

		Person.personCount = 100;// Line D

		p = new Person();// Line E

		System.out.println(Person.personCount);// Line F
	}
}
/*
When the program starts and this main method is kicked off, the Person class is loaded.

This, in turn, makes the static personCount variable available, with a default value of 0 
	
(remember, all instance and static variables start with default values).

Next all of the static initialization blocks, and the static variable's explicit initialization are executed in the order 

they are listed, from top to bottom.  Therefore, the personCount variable is set to 20, 1000, and finally 40.  

So Line A prints "40."

On Line B, an object is instantiated, so that causes the instance initialization blocks 

to be executed in the order they are listed, from top to bottom.  

So now personCount is changed to 10 and finally 30.  Line C prints the value "30."

Line D changes the personCount to 100, but Line E causes the instance initialization blocks to be executed again.  

Therefore, the final value printed in Line F is, once again, "30."  So the answer to the quiz is: 

40

30

30
*/