package docComments;

/**
 * 
 * @author Kelsie and Kseniia
 *
 */
public class Phone {
	private String brand;
	private String model;
	private int memory;
	private int id;
	private static int count = 0;
	
	/**
	 * Constructor initialized the fields
	 * 
	 * @param brand		brand of the phone
	 * @param model		model of the phone
	 * @param memory	amount of memory in GB
	 */
	public Phone(String brand, String model, int memory) {
		this.brand = brand;
		this.model = model;
		this.memory = memory;
		this.id = 1234567 + count++;
	}

	/**
	 * Returns the brand of the phone
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Returns the model of the phone
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the amount of memory on the phone
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * Returns the unique id of the phone
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return brand + " " + model + ", memory: " + memory + " GB, id: " + id + "\n";
	}
}

