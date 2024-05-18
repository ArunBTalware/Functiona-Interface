package functionalinterface.predicate;

import java.util.function.BiConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {
		
		//accept two inputs nothing return anything...
		//get()
		
		BiConsumer< Integer, Integer> add = (a,b) ->{
			
			System.out.println("addition = "+(a+b));
		};

		add.accept(20, 30);
	}

}
