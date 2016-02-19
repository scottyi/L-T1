// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import pass.GCD;

public class GCDTest extends TestCase {

    private GCD gcd;

    protected void setUp() throws Exception {
        
    	super.setUp();
        this.gcd = new GCD();
    }
    
    protected void tearDown() throws Exception {
        
    	super.tearDown();
    }

    public void testGcd() {
    	
    	assertEquals(this.gcd.gcd(10, 4), 2);
        assertEquals(this.gcd.gcd(4, 9), 1);
        assertEquals(this.gcd.gcd(0, 42), 42);
    }

}
