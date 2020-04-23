package fitnessCalculator;

public class testClass {

	public static void main(String[] args) {
		//BMI calculator for US and metric test
		Person p1 = new Person("Sue", "Smith", 25, 0, 160, 5, 10, 40, 36, 36, 40);
		Person p2 = new Person("John", "Doe" , 25, 1, 65, 180, 90, 50, 90, 70);
		
		//BMR calculator test for US woman and men
		Person p3 = new Person("Sue", "Smith", 25, 0, 160, 5, 10, 0, 0, 0, 0);
		Person p4 = new Person("Sue", "Smith", 25, 1, 160, 5, 10, 0, 0, 0, 0);
		
		//BMR calculator test for Metric woman and men
		Person p5 = new Person("John", "Doe" , 25, 0, 60, 180, 0, 0, 0, 0);
		Person p6 = new Person("John", "Doe" , 25, 1, 60, 180, 0, 0, 0, 0);
		
		System.out.println("BMI in US Unit: " + Calculations.bmiCalculator(p1));
		System.out.println("BMI in Metric Unit: " + Calculations.bmiCalculator(p2));
		
		System.out.println();
		
		System.out.println("BMR test for a Woman in US Unit: " + Calculations.bmrCalculator(p3));
		System.out.println("BMR test for a Man in US Unit: " + Calculations.bmrCalculator(p4));
		
		System.out.println();
		
		System.out.println("BMR test for a Woman in Metric Unit: " + Calculations.bmrCalculator(p5));
		System.out.println("BMR test for a Man in Metric Unit: " + Calculations.bmrCalculator(p6));
		
		System.out.println();
		
		System.out.println("Body type calculated in Inches: " + Calculations.bodyTypeCalculator(p1));
		System.out.println("Body type calculated in CM: " + Calculations.bodyTypeCalculator(p2));
		
		System.out.println();
		
		System.out.println("Healthy weight: " + Calculations.healthyWeightCalculator(p1));

	}

}
