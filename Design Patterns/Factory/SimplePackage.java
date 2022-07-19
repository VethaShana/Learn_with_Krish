public class SimplePackage extends giftPackage{ 
	@Override
	protected void creategiftPackage(){
		surprize.add(new BasicBDay());
		surprize.add(new chocolateGift());
		 
	}
} 