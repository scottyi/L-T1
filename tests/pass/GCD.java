package pass;

import java.lang.Integer;
import java.lang.System;

public class GCD {
	
	private int mod(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == b) {
            return 0;
        } else if (a > b) {
            return mod(a - b, b);
        }
        return a;
    }
	
    public int compute(int a, int b) {
        if (a == 0) {
            return b;
        }
        return compute(b, mod(a, b));
    }
    
    public static void main(String[] args) {
        GCD gcd = new GCD();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd.compute(a, b));
    }

}
