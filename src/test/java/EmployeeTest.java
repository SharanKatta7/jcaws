import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class EmployeeTest {
	ArrayList<String> emp=new ArrayList<String>();
	{
	emp.add("Steve");
	emp.add("Marcus");
	emp.add("Eddy");
	emp.add("Will");
	}

	@Test
	public void test() 
	{
		Employee e=new Employee();
		System.out.println(e.findName(emp, "Eddy"));
		assertEquals("FOUND",e.findName(emp, "Eddy"));
		
		
		
	}

}
