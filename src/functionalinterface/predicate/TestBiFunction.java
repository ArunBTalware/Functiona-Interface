package functionalinterface.predicate;

import java.util.function.BiFunction;

public class TestBiFunction {

	public static void main(String[] args) {
		
		BiFunction< Integer, Integer, Integer> multi = (a,b) -> {
			
		      return (a+b);   	
		};

		int mul =multi.apply(10, 20);
		System.out.println(mul);
	}

}
