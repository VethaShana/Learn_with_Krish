public class Application{
	public static void main(String [] args){
		
		Books book1 = new Books("Angel");
		System.out.println(book1);
		
		Books2 book2 = new Books2("Angel");
		System.out.println(book2);
		
		BooksB.Builder builder = new BooksB.Builder("Angel");
		BooksB book3 = builder.noOfPages(25).author("Rajah").build();
		System.out.println(book3);
	}
}