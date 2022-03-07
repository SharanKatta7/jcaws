import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void test() {
		Demo2 palin=new Demo2();
		System.out.println(palin.palindromeCheck("hello"));
		assertEquals(false,palin.palindromeCheck("hello"));
		
	}

}
