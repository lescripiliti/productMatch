package com.b2winc.pojo;

public class ItemPojo {

	private long id;
	private String parceiro;
	private boolean itemMarketplace;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getParceiro() {
		return parceiro;
	}
	
	public void setParceiro(String parceiro) {
		this.parceiro = parceiro;
	}

	public boolean isItemMarketplace() {
		return itemMarketplace;
	}

	public void setItemMarketplace(boolean itemMarketplace) {
		this.itemMarketplace = itemMarketplace;
	}
	
}
