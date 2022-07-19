// Hotel room booking

import java.util.*;

public class Register{
	
	private Map<RoomType,Room> rooms = new HashMap<>();
	
	public Register(){
		
		this.initialize();
	}
	
	public Room getRoom(RoomType roomType){
		
		Room room = null;
		
		try{
			room= (Room) rooms.get(roomType).clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return room;
	}
	
	private void initialize(){
		
		ACRoom acroom= new ACRoom();
		acroom.setRoomType("Normal");
		acroom.setNoOfBeds(2);
		acroom.setNumberOfACs(2);
		
		NACRoom nacroom = new NACRoom();
		nacroom.setRoomType("Luxury");
		nacroom.setNoOfBeds(3);
		nacroom.setFanType("Usha");
		
		rooms.put(RoomType.ACRoom,acroom);
		rooms.put(RoomType.NACRoom,nacroom);
		
		
		
	}
	
}