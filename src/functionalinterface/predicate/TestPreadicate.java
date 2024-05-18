package functionalinterface.predicate;

import java.util.function.Predicate;

public class TestPreadicate {

	public static void main(String[] args) {
		
		//it take one input parameter and return boolean value
		// it has test method
		
		Predicate<Integer> predicate = a -> {
			
			if(a==10)
				return true;
			
			return false;
		};
			
			
	
		
		boolean result = predicate.test(5);	
		
		System.out.println(result);

	}

}
