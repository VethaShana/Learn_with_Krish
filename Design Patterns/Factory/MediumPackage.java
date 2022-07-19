public class MediumPackage extends giftPackage{ 
	@Override
	protected void creategiftPackage(){
		surprize.add(new BasicBDay());
		 surprize.add(new chocolateGift());
		 surprize.add(new teddyGift());
	}
} 