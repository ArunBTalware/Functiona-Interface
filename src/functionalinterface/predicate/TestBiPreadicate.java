package functionalinterface.predicate;

import java.util.function.BiPredicate;

public class TestBiPreadicate {

	public static void main(String[] args) {
		// take two input argument and return boolean value
		//has method test()
		
		BiPredicate<Integer, Integer> compaire = (a,b) -> {
			
			if(a>b)
				return true;
			return false;
		};
		
		boolean test1=compaire.test(100, 20);
		
		System.out.println(test1);
		

	}

}
