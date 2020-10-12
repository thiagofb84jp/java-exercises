package br.com.exercises.orientedObjects.invoiceItem;

public class InvoiceItem {
	
	private int id;
	
	private String desc;
	
	private int qty;
	
	private double unitPrice;
	
	public InvoiceItem(int id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public int getId() {
		return id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDesc() {
		return desc;
	}
	
	public double getTotal() {
		return this.unitPrice * this.qty; 
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InvoiceItem [id=");
		builder.append(id);
		builder.append(", desc=");
		builder.append(desc);
		builder.append(", qty=");
		builder.append(qty);
		builder.append(", unitPrice=");
		builder.append(unitPrice);
		builder.append("]");
		return builder.toString();
	}
}