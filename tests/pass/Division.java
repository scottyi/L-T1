package pass;

import java.lang.System;
import java.lang.Integer;

public class Division {
	
	public int divide(int x, int y) {
		
		return x / y;
	}
	
	 public static void main(String[] args) {
			
		 	Division division = new Division();
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a + " / " + b + " = " + division.divide(a, b));		
		}
}
