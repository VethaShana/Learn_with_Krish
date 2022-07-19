public class ATMMachine {
 
	private Money money1;
	
	public ATMMachine() {
		money1 = new Rs5000();
		Money money2 = new Rs1000();
		Money money3 = new Rs500();
		Money money4 = new Rs100();
		Money money5 = new Rs50();
		
		money1.setNextChain(money2);
		money2.setNextChain(money3);
		money3.setNextChain(money4);
		money4.setNextChain(money5);
	}
	
	public Money getMoney() {
		return money1;
	}
}