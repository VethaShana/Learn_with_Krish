import java.util.ArrayList;
import java.util.List;

public class Caretaker
{
		private List<Memento> LaptopsList = new ArrayList<Memento>();

		public void addMemento( Memento m )
		{
				LaptopsList.add(m);
				System.out.println("Laptop's details :" + LaptopsList);
		}

		public Memento getMemento( int index )
		{
				return LaptopsList.get(index);
		}
}