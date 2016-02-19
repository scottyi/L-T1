package pass;

import java.lang.System;
import java.lang.Integer;

public class MinusAssign {

    public static int minusAssign(int x, int y) {
       
    	return x -= y;
    }
    
    public static void main(String[] args) {
    	MinusAssign minusAssign = new MinusAssign();
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("x = " + a + " y = " + b);
		System.out.println("(a -= b)" + " => a = " + minusAssign.minusAssign(a, b));
		
	}

}
