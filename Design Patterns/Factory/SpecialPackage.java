public class SpecialPackage extends giftPackage{ 
	@Override
	protected void creategiftPackage(){
		surprize.add(new BasicBDay());
		 surprize.add(new chocolateGift());
		 surprize.add(new teddyGift());
		 surprize.add(new dancingGift());
		 surprize.add(new unknownGift());
	}
} 