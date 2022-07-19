public interface Money {

	public abstract void setNextChain(Money money);
	public abstract void dispense(Currency currency);
}