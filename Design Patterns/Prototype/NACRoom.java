public class NACRoom extends Room{
	
	private String Fantype;
	
	public String getFanType(){
		return Fantype;		
	}
	
	public void setFanType(String Fantype){
		this.Fantype= Fantype;
	}
	
	@Override
	public String toString() {
		return "NACRoom{" + "Fantype =" + Fantype+"}";
	}

}