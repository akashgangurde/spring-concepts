package com.ag;

public class PrintableFactory {
	
	public static Printable getPrintable() {
		return new B();
	}

}
