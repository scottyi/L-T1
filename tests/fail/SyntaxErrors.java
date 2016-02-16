package fail;

import java.lang.Integer;
import java.lang.System;

public class SyntaxErrors {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println(x + "! = " + factorial(x));
    }

}
