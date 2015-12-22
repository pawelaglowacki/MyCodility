import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

public class PermCheckTest {

	private PermCheck perm;
	
	@Before
	public void SetUp()
	{
	perm = new PermCheck();	
	}
	
	@Test
	public void test() {
		
		int[] A = {7,2,3,4,5};
		
	Assert.assertEquals(0, perm.solution(A));
		
	}

}
