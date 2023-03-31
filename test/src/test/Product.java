package test;

public class Product {
private int prodID;
private String prodName;
private int prodPrice;

public Product(int prodID, String prodName, int prodPrice) {
	this.prodID = prodID;
	this.prodName = prodName;
	this.prodPrice = prodPrice;
}

public String toString() {
	return "The product's name is: " + prodName + ", id is: " + prodID + "price is $" + prodPrice + ".";
}
}
