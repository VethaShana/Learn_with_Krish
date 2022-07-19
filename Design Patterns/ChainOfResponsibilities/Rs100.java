public class Rs100 implements Money{
 
	private Money money;
	
	
	@Override
	public void setNextChain(Money money) {
		this.money = money;
	}
 
	@Override
	public void dispense(Currency currency) {
		
		if(currency.getCashAmount() >=100) {
			int n = currency.getCashAmount()/100;
			int remainder = currency.getCashAmount() % 100;
			System.out.println("Withdrawing " + n  +" Notes of Rs 100");
			if(remainder !=0) {
				money.dispense(new Currency(remainder));
			}
				
		}else {
			money.dispense(currency);
		}
		
	}
 
}