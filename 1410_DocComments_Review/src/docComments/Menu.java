package docComments;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int selection;
		Scanner input = new Scanner(System.in);
		ArrayList<Phone> phones = new ArrayList<Phone>();
		Phone phone1 = new Phone("Apple","iPhone 8", 128);
		Phone phone2 = new Phone("Apple","iPhone X", 256);
		Phone phone3 = new Phone("Motorola","RAZR XT912", 32);
		Phone phone4 = new Phone("BlackBerry","Classic", 128);
		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);
		phones.add(phone4);
		
		
		
		/*System.out.println("1. Show all phones");
		System.out.println("2. Add a phone");
		System.out.println("3. Find a phone");
		System.out.println("4. Delete a phone");
		System.out.println("5. Number of phones");
		System.out.println("6. Exit");
		System.out.print("Enter your selection: ");
		
		selection = input.nextInt();
		System.out.println("");*/
		
		do {
			System.out.println("1. Show all phones");
			System.out.println("2. Add a phone");
			System.out.println("3. Find a phone");
			System.out.println("4. Delete a phone");
			System.out.println("5. Number of phones");
			System.out.println("6. Exit");
			System.out.print("Enter your selection: ");
			
			selection = input.nextInt();
			//System.out.println("");
			switch(selection) {
			case 1:
				for(Phone el : phones) {
					System.out.println(el);
				}
				break;
				
			case 2:
				String brand;
				String model;
				int memory;
				
				System.out.print("Brand: ");
				brand = input.nextLine();
				System.out.println();
				
				System.out.print("Model: ");
				model = input.nextLine();
				System.out.println();
				
				System.out.print("Memory (number of GB only): ");
				memory = input.nextInt();
				System.out.println();
				
				
				Phone phoneX = new Phone(brand, model, memory);
				
				phones.add(phoneX);
				
				break;
				
			case 3:
				int searchId;
				
				System.out.print("Id: ");
				searchId = input.nextInt();
				
				for(Phone el: phones) {
					if(searchId == el.getId()) {
						System.out.println(el);
					}else if(searchId != el.getId()){
						System.out.println("ID not found.");
					}
					//TODO: Enter logic check, "ID not found"					
				}
				
				break;
			case 4:
				int deleteId;
				
				System.out.print("Id: ");
				deleteId = input.nextInt();
				
				int deleteEl = phones.indexOf(deleteId);
				System.out.println(deleteEl);
				
				break;
				
			case 5:
				int numOfPhone = 0;
				for(int i = 0; i <= phones.size(); i++) {
					numOfPhone++;
				}
				System.out.printf("Number of phones: %d %n%n", numOfPhone);
				
				break;
			case 6:
				System.out.print("GoodBye");
				break;
			}
			// TODO: Figure out a way to reset selection variable. 
		}while (selection != 6);

	}

}
/*
 * brand, model, and memory
Apple| iPhone 8 Plus, iPhone 8, iPhone X, iPhone 11
32GB, 128GB, 256GB
BlackBerry| Classic, Storm, Curve, Volt, Pearl
32GB, 128GB, 256GB
Motorola| RAZR XT912, DROID RAZR
32GB, 128GB, 256GB
*/
