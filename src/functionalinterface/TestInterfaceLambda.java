package functionalinterface;

public class TestInterfaceLambda {

	public static void main(String[] args) {
		
		TestFunctionalInterface test = (name) -> {
			
			System.out.println("name>>"+name);
		};
		
		test.getName("Arun");

	}

}
