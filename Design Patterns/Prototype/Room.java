public abstract class Room implements Cloneable {
	
	private String roomType;
	private int noOfBeds;
	
	public String getRoomType(){
		return roomType;		
	}
	
	public void setRoomType(String roomType){
		this.roomType= roomType;
	}
	
	public int getNoOfBeds(){
		return noOfBeds;		
	}
	
	public void setNoOfBeds(int noOfBeds){
		this.noOfBeds= noOfBeds;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}