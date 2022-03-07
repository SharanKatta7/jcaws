import static org.junit.Assert.*;

import org.junit.Test;

public class PassValidatorTest {

	@Test
	public void test() {
		 //PassValidator ob=new PassValidator();

		 boolean res=PassValidator.isValid("abc123");

		 assertEquals(true,res);

	}

}
