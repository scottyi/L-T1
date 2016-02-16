
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

		this.assertEquals(minusAssign.minusAssign(42, 10), 32);
		this.assertEquals(minusAssign.minusAssign(42, 1), 41);
		this.assertEquals(minusAssign.minusAssign(127, 3), 124);
		
	}
	
	
}
