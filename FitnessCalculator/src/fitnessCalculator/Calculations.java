package fitnessCalculator;

public class Calculations {
	
	private static int heightToTotalInches(int feet, int inches) {
		return (feet * 12) + inches;
	}
	
	/**
	 * Converts Centimeters to Meters for equations
	 * @param CM
	 * @return Meters
	 */
	private static double convertCmToM(int CM) {
		return CM * 100;
	}
	
	/**
	 * This will calculate the users Body mass index
	 * @param height
	 * @param weight
	 * @param e
	 * @return
	 */
	public static double bmiCalculator(Person person) {
		int bmi;
		if(person.getUnitType() == UnitType.US) {
			double totalInches = heightToTotalInches(person.getHeightFt(), person.getHeightInch());
			double weight = (person.getWeightLbs() * 703);
			double height = totalInches * totalInches;
			return weight / height;
			
		}
		else {
			double meters = convertCmToM(person.getHeightCm());
			bmi = (int) (person.getWeightKg() / (meters * meters));
		}
		return bmi;
	}
	/**
	 * This will calculate the users Basal metabolic rate
	 * @param height
	 * @param weight
	 * @param age
	 * @param gender 0 = male & 1 = female
	 * @param e US or METRIC
	 * @return
	 */
	public static int bmrCalculator(int height, int weight, int age, int gender, UnitType e) {
		return 0;
	}
	/**
	 * This will generate the body type of the user
	 * @param bust
	 * @param waist
	 * @param hipHeight
	 * @param hipSize
	 * @param e US or METRIC
	 * @return
	 */
	public static String bodyTypeCalculator(int bust, int waist, int hipHeight, int hipSize, UnitType e) {
		return null;
	}
	
	/**
	 * This will generate a healthy weight based off the users height at weight
	 * @param height
	 * @param weight
	 * @param e US or METRIC
	 * @return Healthy weight for the user to aim for
	 */
	public static int healthyWeightCalculator(int height, int weight, UnitType e) {
		return 0;
	}
	
	

}
