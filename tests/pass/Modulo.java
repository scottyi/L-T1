package pass;

import java.lang.System;
import java.lang.Integer;

public class Modulo {

    public int modulo(int x, int y) {
        
    	return x % y;
    }
    
    public static void main(String[] args) {
		
    	Modulo modulo = new Modulo();
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a + " % " + b + " = " + modulo.modulo(a, b));
		
	}
}
