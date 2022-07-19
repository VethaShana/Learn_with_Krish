import java.util.Scanner;


public class Test {

	
	public static void main(String[] args) {
		
		ATMMachine  atmMachine = new ATMMachine();
		
		Scanner scanner = null;
		while (true) {
			int amount = 0;
 			try {
				System.out.println("Please enter amount to despense:");
				scanner = new Scanner(System.in);
				amount= scanner.nextInt();
				
				if(amount %50 !=0) {
					System.out.println("Amount should be multiple of Rs 50");
					return;
				}
				atmMachine.getMoney().dispense(new Currency(amount));
				return;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}