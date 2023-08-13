package com.dilmac;

public class App {

	public static void main(String[] args) {
		/**
		 *  There three ways to implement body of declared method in interface.
		 *  1. Traditional way
		 *  2. Using Anonymous Class
		 *  3. Using Lambda Expression
		 */
		
		/**
		 * 1. Traditional way to use implemented method.
		 * First we need to declare a class (in our case LambdaImp.java) that implements an interface
		 * Then we have to implement the body of abstract method(s).
		 * --- Usage: create an instance of class then call the method(which is display).
		 */
		LambdaImp lambdaImp=new LambdaImp();
		lambdaImp.display("This is an example of Traditional way to use implemented abstract method");
		
		System.out.println("****************************************************");
		/**
		 * 2. Using Anonymous class to impelement abstract method without extrac implemantation class
		 * First we need to create an instance of anonymous class with the implementation of the method.
		 */
		ILambdaExpression anonymousObj=new ILambdaExpression() {
			
			@Override
			public void display(String message) {
				System.out.println("This method is an implementation of interface method\nMessage :"+message);
				
			}
		};
		
		anonymousObj.display("This is an example of Using Anonymous Class to  implement and use abstract method");
	
	
	}

}
