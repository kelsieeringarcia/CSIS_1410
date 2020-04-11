package fitnessCalculator;

public class testClass {

	public static void main(String[] args) {
		Person p1 = new Person("Sue", "Smith", 25, 1, 160, 5, 10, 0, 0, 0, 0);
		Person p2 = new Person("John", "Doe" , 25, 1, 60, 180, 0, 0, 0, 0);
		
		System.out.println(Calculations.bmiCalculator(p1));
		System.out.println(Calculations.bmiCalculator(p2));
		
		System.out.println();
		
		System.out.println(Calculations.bmrCalculator(p1));
		System.out.println(Calculations.bmrCalculator(p2));

	}

}
