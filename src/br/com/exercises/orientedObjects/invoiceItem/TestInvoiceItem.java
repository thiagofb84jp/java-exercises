package br.com.exercises.orientedObjects.invoiceItem;

public class TestInvoiceItem {
	
	public static void main(String[] args) {
		InvoiceItem invoiceItem1 = new InvoiceItem(1, "Dell Computer Vostro New Generation", 1, 5500.54);
		
		System.out.println(invoiceItem1.toString());
		
		System.out.println("***************** Invoice Item (1) *****************");
		System.out.println("ID: " + invoiceItem1.getId());
		System.out.println("Product Description: " + invoiceItem1.getDesc());
		System.out.println("Quantity: " + invoiceItem1.getQty());
		System.out.println("Value: " + invoiceItem1.getUnitPrice());
		System.out.println("Total Value: " + invoiceItem1.getTotal());

		System.out.println("\n***************** Invoice Item (2) *****************");
		InvoiceItem invoiceItem2 = new InvoiceItem(2, "Pencil Bic Blue Color", 30, 2.99);		
		System.out.println("ID: " + invoiceItem2.getId());
		System.out.println("Product Description: " + invoiceItem2.getDesc());
		System.out.println("Quantity: " + invoiceItem2.getQty());
		System.out.println("Value: " + invoiceItem2.getUnitPrice());
		System.out.println("Total Value: " + invoiceItem2.getTotal());
	}
}