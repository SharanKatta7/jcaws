import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void test() {
		Demo1 sc=new Demo1();
		assertEquals("HelloWorld",sc.stringconcat("Hello", "World"));
	}

}
