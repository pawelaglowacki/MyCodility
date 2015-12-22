import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TapeEquilibriumTest {

	
	private TapeEquilibrum tape;

	@Before
	public void setUp() {
		tape = new TapeEquilibrum();
	}


@Test
public void shouldreturn1()
{
	//given
	int[] testArray = {3,1,2,4,3};
	//when
	int result = tape.solution(testArray);
	//then
	Assert.assertEquals(1, result);
}

}