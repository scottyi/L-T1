package junit;

import junit.framework.TestCase;
import pass.MinusAssign;

public class MinusAssignTest extends TestCase {
    private MinusAssign minusAssign;

    protected void setUp() throws Exception {
        super.setUp();
        minusAssign = new MinusAssign();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMinusAssign() {
        
    	this.assertEquals(this.minusAssign.minusAssign(42, 42), 0);
        this.assertEquals(this.minusAssign.minusAssign(42, 1), 41);
        this.assertEquals(this.minusAssign.minusAssign(127, 3), 124);
    }

}