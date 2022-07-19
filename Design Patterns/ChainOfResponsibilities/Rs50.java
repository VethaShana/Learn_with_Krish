public class Rs50 implements Money{
 
	private Money money;
	
	
	@Override
	public void setNextChain(Money money) {
		this.money = money;
	}
 
	@Override
	public void dispense(Currency currency) {
		
		if(currency.getCashAmount() >=50) {
			int n = currency.getCashAmount()/50;
			int remainder = currency.getCashAmount() % 50;
			System.out.println("Withdrawing " + n  +" Notes of Rs 50");
			if(remainder !=0) {
				money.dispense(new Currency(remainder));
			}
				
		}else {
			money.dispense(currency);
		}
		
	}
 
}