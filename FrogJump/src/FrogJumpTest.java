import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

public class FrogJumpTest {
	
	private FrogJump frog;
	
	@Before
	public void SetUp()
	{
	frog = new FrogJump();	
	}
	
	@Test
	public void test() {
		System.out.println(frog.solution(33, 120, 8));
}
}