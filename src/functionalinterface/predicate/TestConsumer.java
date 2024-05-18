package functionalinterface.predicate;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		
		//consumer accespt one input does not return anything
		
		Consumer< String> test = (name) -> {
			
			System.out.println("name>>"+name);
		};
		
		test.accept("Kunal");
	}

}
