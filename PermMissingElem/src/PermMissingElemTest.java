import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermMissingElemTest {

	private PermMissingElem elem;
	int	array[] = {1,2,3,5};			

	
	@Before
	public void SetUp()
	{
	elem = new PermMissingElem();
	}
	
	@Test
	public void test() {
		//given
		//when
		int result = elem.solution(array);
		//then
		assertEquals(4, result);
	}

}
