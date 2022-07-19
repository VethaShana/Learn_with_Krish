// birthday surprizing group

import java.util.*;


public abstract class giftPackage{
	
	protected List<Surprize> surprize = new ArrayList<>();
	
	public giftPackage(){
		creategiftPackage();
		
	}
	
	protected abstract void creategiftPackage();
	
	@Override
	public String toString(){
		return "giftPackage{" +
		"surprize" + surprize+ "}";
	}
} 