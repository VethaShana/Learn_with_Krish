public class Laptop
{
		private String  size;
		private String  price;
		private String  RAM;
		private String  type;
		private boolean networkPort;

		public Laptop( String size, String price, String RAM, String type, boolean networkPort )
		{
				super();
				this.size = size;
				this.price = price;
				this.RAM = RAM;
				this.type = type;
				this.networkPort = networkPort;
		}

		public String getSize()
		{
				return size;
		}

		public void setSize( String size )
		{
				this.size = size;
		}

		public String getPrice()
		{
				return price;
		}

		public void setPrice( String price )
		{
				this.price = price;
		}
		
		public String getRAM()
		{
				return RAM;
		}

		public void setRAM( String RAM )
		{
				this.RAM = RAM;
		}
		
		public String getType()
		{
				return type;
		}

		public void setType( String type )
		{
				this.type = type;
		}

		public boolean isNetworkPort()
		{
				return networkPort;
		}

		public void setNetworkPort( boolean networkPort )
		{
				this.networkPort = networkPort;
		}

		@Override
		public String toString()
		{
				return "Laptop [size=" + size + ", price=" + price + ",  RAM=" + RAM + ", type=" + type + ", networkPort=" + networkPort + "]";
		}

}