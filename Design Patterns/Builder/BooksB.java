// Books in Library

public class BooksB{
	
	private final int noOfPages;
	private final String name;
	private final String author;
	private final int year;
	private final String country;
	
	
	public BooksB(Builder builder){
		this.name=builder.name;
		this.noOfPages=builder.noOfPages;
		this.author=builder.author;
		this.country=builder.country;
		this.year=builder.year;
	}
	
	static class Builder{
		private String name;
		private int noOfPages;
		private String author;
		private int year;
		private String country;
	
	
		public BooksB build(){
			return new BooksB(this);
		}
		
		
		public Builder(String name){
			this.name=name;
		}
		
		public Builder noOfPages(int noOfPages){
			this.noOfPages=noOfPages;
			return this;
		}
		
		public Builder author(String author){
			this.author=author;
			return this;
		}
		
		public Builder country(String country){
			this.country=country;
			return this;
		}
		
		public Builder year(int year){
			this.year=year;
			return this;
		}
	
	}
	
	@Override
	public String toString(){
		return "Book(" + name +"," + noOfPages +","+author +","+year +","+country+" )";
	}
	
}