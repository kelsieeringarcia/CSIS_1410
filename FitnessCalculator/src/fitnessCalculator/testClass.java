package fitnessCalculator;

public class testClass {

	public static void main(String[] args) {
		Person p1 = new Person("Sue", "Smith", 25, 1, 160, 5, 10, 0, 0, 0, 0);
		Person p2 = new Person("John", "Doe" , 0, 0, 72.57, 178, 0, 0, 0, 0);
		
		System.out.println(Calculations.bmiCalculator(p2));

	}

}
