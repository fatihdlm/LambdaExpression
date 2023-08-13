package com.dilmac;

public class App {

	public static void main(String[] args) {
		/**
		 *  There two way to use interface method.
		 *  1. Traditional way
		 *  2. Using Lambda Expression
		 */
		
		/**
		 * 1. Traditional way to use implemented method.
		 * First we need to declare a class (in our case LambdaImp.java) that implements an interface
		 * Then we have to implement the body of abstract method(s).
		 * --- Usage: create an instance of class then call the method(which is display).
		 */
		LambdaImp lambdaImp=new LambdaImp();
		lambdaImp.display("This is an example of Traditional way to use implemented abstract method");
	
	}

}
