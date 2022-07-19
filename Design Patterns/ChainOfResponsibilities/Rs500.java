public class Rs500 implements Money{
 
	private Money money;
	
	
	@Override
	public void setNextChain(Money money) {
		this.money = money;
	}
 
	@Override
	public void dispense(Currency currency) {
		
		if(currency.getCashAmount() >=500) {
			int n = currency.getCashAmount()/500;
			int remainder = currency.getCashAmount() % 500;
			System.out.println("Withdrawing " + n  +" Notes of Rs 500");
			if(remainder !=0) {
				money.dispense(new Currency(remainder));
			}
				
		}else {
			money.dispense(currency);
		}
		
	}
 
}