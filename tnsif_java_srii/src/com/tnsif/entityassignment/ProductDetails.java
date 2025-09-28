package com.tnsif.entityassignment;

public class ProductDetails {
	private String product;
	private int prize;
	private int netweight;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public int getNetweight() {
		return netweight;
	}
	public void setNetweight(int netweight) {
		this.netweight = netweight;
	}
	@Override
	public String toString() {
		return "ProductDetails [product=" + product + ", prize=" + prize + ", netweight=" + netweight + "]";
	}
	
}
