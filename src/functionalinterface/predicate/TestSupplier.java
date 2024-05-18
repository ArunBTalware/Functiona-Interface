package functionalinterface.predicate;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		
		//supplier 1.does not take input parameter and  return one value
		//it has get method
		Supplier<Integer> supplier = () -> {
			int a=20;
			int square = a*a;
			return square;
		};

		System.out.println(supplier.get());
		
	}

}
