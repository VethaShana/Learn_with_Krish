public class Originator
{
		Laptop laptop;

		public Laptop getLaptop()
		{
				return laptop;
		}

		public void setLaptop( Laptop laptop )
		{
				this.laptop = laptop;
		}

		public Memento createMemento()
		{
				return new Memento(laptop);
		}

		public void setMemento( Memento memento )
		{
				laptop = memento.getLaptop();
		}

		@Override
        public String toString()
        {
		        return "Originator [" + laptop + "]";
        }

		
		
}