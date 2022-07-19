public class giftPackageArea{
	
	public static giftPackage creategiftPackage(giftPackageCode giftpackageCode){
		switch (giftpackageCode){
			case BDAYSI:
				return new SimplePackage();
			case BDAYM:
				return new MediumPackage();
			case BDAYSP:
				return new SpecialPackage();
			default:
				return null;
		}
	}

}