package com.dilmac;

public class LambdaImp implements ILambdaExpression {
	@Override
	public void display(String message) {
		System.out.println("This method is an implementation of interface method\nMessage :"+message);
		
	}

}
