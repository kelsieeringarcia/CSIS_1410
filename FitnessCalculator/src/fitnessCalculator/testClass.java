package fitnessCalculator;

public class testClass {

	public static void main(String[] args) {
		Person p1 = new Person("Sue", "Smith", 25, 1, 160, 5, 10, 0, 0, 0, 0);
		
		System.out.println(Calculations.bmiCalculator(p1));

	}

}
