package com.springDI;

public class Buyer {
	
	private Seller seller;
	
	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public void  Buy(){
		
		
		
		
		System.out.print("Bought several product from ");
		System.out.println(seller.getName());
	}

}
