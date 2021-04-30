package com.ag;

public class A {
	
	private static final A obj = new A();
	
	private A () {
		System.out.println("Constructor of A invoked");
	}
	
	public static A getA() {
		System.out.println("Factory Method invoked");
		return obj;
	}
	
	public void msg() {
		System.out.println("msg()invoked Hello user");
	}
}
