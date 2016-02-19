package pass;

import java.lang.Integer;
import java.lang.System;

public class GCD {
	
	public int gcd(int x, int y){
		if(y==0){
			return x;
		}
		return gcd(y, (x % y));
	}
	
	public static void main(String[] args) {
		GCD gcd = new GCD();
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("GCD(" + a + "," + b + ") = " + gcd.gcd(a, b));
		
	}
}