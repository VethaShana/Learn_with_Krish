public class ACRoom extends Room{
	
	private int numberOfACs;
	
	public int getNumberOfACs(){
		return numberOfACs;		
	}
	
	public void setNumberOfACs(int numberOfACs){
		this.numberOfACs= numberOfACs;
	}
	
	@Override
	public String toString() {
		return "ACRoom{" + "numberOfACs=" + numberOfACs+"}";
		
	}

}