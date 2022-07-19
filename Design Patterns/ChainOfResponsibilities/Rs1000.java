public class Rs1000 implements Money{
 
	private Money money;
	
	
	@Override
	public void setNextChain(Money money) {
		this.money = money;
	}
 
	@Override
	public void dispense(Currency currency) {
		
		if(currency.getCashAmount() >=1000) {
			int n = currency.getCashAmount()/1000;
			int remainder = currency.getCashAmount() % 1000;
			System.out.println("Withdrawing " + n  +" Notes of Rs 1000");
			if(remainder !=0) {
				money.dispense(new Currency(remainder));
			}
				
		}else {
			money.dispense(currency);
		}
		
	}
 
}