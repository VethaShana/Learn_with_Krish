public class Memento
{
		private Laptop laptop;

		public Memento( Laptop laptop )
		{
				super();
				this.laptop = laptop;
		}

		public Laptop getLaptop()
		{
				return laptop;
		}

		public void setLaptop( Laptop laptop )
		{
				this.laptop = laptop;
		}

		@Override
        public String toString()
        {
		        return " " + laptop;
        }

		
		
}