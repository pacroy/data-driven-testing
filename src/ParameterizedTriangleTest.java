import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTriangleTest {
	private int a;
	private int b;
	private int c;
	private int type;

	public ParameterizedTriangleTest(int a, int b, int c, int type) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.type = type;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{3,3,3,3},
			{5,5,5,3},
			{5,4,4,2},
			{4,5,4,2},
			{4,4,5,2},
			{3,4,5,1},
			{5,4,3,1},
			{4,7,5,1},
		});
	}
	
	@Test
	public void parameterized_test() {
		assertEquals(type, Triangle.getType(a,b,c));
	}

}
