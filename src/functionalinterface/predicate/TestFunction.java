package functionalinterface.predicate;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		
		// take one input parameter and return one parameter
		//it has applay() method
		
		Function<Integer, Integer> function = (a) -> {
			
			return a++;
		};
		int incarement = function.apply(10);
		
		System.out.println(incarement);
		
	}

}
