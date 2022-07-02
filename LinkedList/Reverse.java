import java.util.LinkedList;

public class Reverse {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
	
	int n = cars.size();
	
	System.out.print("Reverse order : [");
	
	for(int i=1;i<n;i++){
		String x = cars.getLast();
		System.out.print(x + ", ");
		cars.addFirst(x);
		cars.removeLast();
		
	}
	
	String x = cars.getLast();
	System.out.print(x + "]");
	cars.addFirst(x);
	cars.removeLast();
  }
}