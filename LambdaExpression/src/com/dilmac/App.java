package com.dilmac;

public class App {

	public static void main(String[] args) {
		/**
		 *  There are three ways to implement body of declared method in interface.
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
		lambdaImp.display("1. Way - This is an example of Traditional way to use implemented abstract method");
		
		System.out.println("****************************************************");
		/**
		 * 2. Using Anonymous class to implement abstract method without extract implementation class
		 * First we need to create an instance of anonymous class with the implementation of the method.
		 */
		ILambdaExpression anonymousObj=new ILambdaExpression() {
			
			@Override
			public void display(String message) {
				System.out.println("This method is an implementation of interface method\nMessage :"+message);
				
			}
		};
		anonymousObj.display("2. Way - This is an example of Using Anonymous Class to  implement and use abstract method");
		
		System.out.println("****************************************************");
		/**
		 * 3. Using Lambda Expression to implement abstract method without extract implementation class
		 * The fist rule to use lambda expression is that, the interface has to contain only one abstract method.
		 * It means the interface has to be @FunctionalInterface.
		 *
		 */
		
		ILambdaExpression iLambdaExpression= (String message)-> {
			System.out.println("This method is an implementation of interface method\nMessage :"+message);
			};
		iLambdaExpression.display("3. Way - This is an example of Using Lambda Expression to  implement and use abstract method");
		
		System.out.println("****************************************************");
		/**
		 * Enhancment of Lambda Expression
		 * During the runtime java will recognize the data type so we don't need to mention it.  So we can remove "String"
		 * If the method takes just only one parameter, we can remove "(", ")" parenthesis
		 * If the method implemented with only one statement we can also remove "{","}" Curly brackets {} too.
		 */
		
		ILambdaExpression iLambdaExpressionEnhancment= message-> System.out.println("This method is an implementation of interface method\nMessage :"+message);
		iLambdaExpressionEnhancment.display("4. Way - This is an example of Using Lambda Expression to  implement and use abstract method");
		
		
	
	}

}
