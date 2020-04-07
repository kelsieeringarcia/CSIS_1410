package keyValue;

public class TestClient {

	public static void main(String[] args) {
		
		System.out.println("Part 1: ");
		System.out.println("-------");
		
		KeyValuePair<String, Integer> p1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<>("NY", 8244910);
		
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		
		System.out.println();
		
		KeyValuePair<String, Integer> p3 = p2;
		System.out.println("p3: " + p3.toString());
		System.out.println("p2.equals(p3): " + p2.equals(p3));
		
		
		
	}
}
