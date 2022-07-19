public class Application{
	public static void main(String [] args){
		

		Register register = new Register();
		
		ACRoom room256 = (ACRoom)register.getRoom(RoomType.ACRoom);
		System.out.println("room256 : " + room256);
		
		room256.setNumberOfACs(3);
		System.out.println("room256 : " + room256);
		
		ACRoom room257 = (ACRoom)register.getRoom(RoomType.ACRoom);
		System.out.println("room257 : " + room257);

		
	}
}