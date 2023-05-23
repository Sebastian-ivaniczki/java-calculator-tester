package calculatero.org;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;

public class CalculateroTest {
	
	Random rnd = new Random();
	float x = rnd.nextFloat(0,100);
	float y = rnd.nextFloat(1,100);
	Calculatero c = new Calculatero(x,y);
	
	float sumRes = x + y;
	float difRes = x - y;
	float multiRes = x * y;
	float divRes = x / y;
	
	float resAdd = c.add(x, y);
	float resDif = c.sub(x, y);
	float resMult = c.mult(x, y);
	float resDiv = c.div(x, y);
	
	@RepeatedTest(10)
	public void sumTest() {
		assertEquals(resAdd, sumRes);
	}
	
	@RepeatedTest(10)
	public void subTest() {
		assertEquals(resDif, difRes);
	}
	
	@RepeatedTest(10)
	public void multiTest() {
		assertEquals(resMult, multiRes);
	}
	
	@RepeatedTest(10)
	public void divTest() {
		assertEquals(resDiv, divRes);
	}
}
