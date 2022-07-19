public class MementoClient
{

		public static void main( String[] args )
		{
				Originator originator = new Originator();
				originator.setLaptop(new Laptop("18 inch", "Rs.285,000","16 GB","HP", false));

				Caretaker caretaker = new Caretaker();
				caretaker.addMemento(originator.createMemento());

				originator.setLaptop(new Laptop("16 inch", "Rs.210,000","8 GB","DELL",  true));
				caretaker.addMemento(originator.createMemento());

				originator.setLaptop(new Laptop("15.5 inch", "Rs.135,000", "4 GB","HP",  true));
				
				System.out.println("\nOrignator current state : " + originator);

				System.out.println("\nOriginator restoring to 18 inch Laptop...");

				originator.setMemento(caretaker.getMemento(0));

				System.out.println("\nOrignator current state : " + originator);

		}

}