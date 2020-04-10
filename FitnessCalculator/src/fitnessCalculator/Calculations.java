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
	private static double convertCmToM(double CM) {
		return CM / 100;
	}
	
	/**
	 * This will calculate the users Body mass index
	 * @param person this will get what is needed from the person in the equation
	 * @return BMI of person
	 */
	public static double bmiCalculator(Person person) {

		if(person.getUnitType() == UnitType.US) {
			double totalInches = heightToTotalInches(person.getHeightFt(), person.getHeightInch());
			double weight = (person.getWeightLbs() * 703);
			double height = totalInches * totalInches;
			double bmiUs = weight / height;
			return Math.round(bmiUs * 100) / 100.0;
			
		}
		else {
			double meters = convertCmToM(person.getHeightCm());
			double meterSquare = meters * meters;
			double bmiMetric = (person.getWeightKg() / (meterSquare));
			return Math.round(bmiMetric * 100) / 100.0;
		}
		
	}
	/**
	 * This will calculate the users Basal metabolic rate
	 * @return
	 */
	public static int bmrCalculator(Person person) {
		return 0;
	}
	/**
	 * This will generate the body type of the user
	 * @return
	 */
	public static String bodyTypeCalculator(Person person) {
		return null;
	}
	
	/**
	 * This will generate a healthy weight based off the users height at weight
	 * @return Healthy weight for the user to aim for
	 */
	public static int healthyWeightCalculator(Person person) {
		return 0;
	}
	
	

}
