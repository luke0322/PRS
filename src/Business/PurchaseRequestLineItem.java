package Business;

public class PurchaseRequestLineItem {
private int quantity;
private int id;
//get purchaserequestID
//get productID
public PurchaseRequestLineItem(int quantity, int id) {
	super();
	this.quantity = quantity;
	this.id = id;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "id = "+id+", quantity = "+quantity;
}
}
