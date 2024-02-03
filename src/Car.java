	public class Car {
		
		private String model;
		private String year;
		private double price;
		private double discount;
	public Car (String model, String year, double price) {
	this.model = model;
	this.year = year;
	if (price > 0) {
	this.price = price;
	}
	if (discount > 0 & discount < 100) {
	this.discount = (discount / 100);
	}
	}
	
	public void setModel (String model) {
	this.model = model;
	}
	
	public void setYear (String year) {
	this.year = year;
	}
	
	public void setPrice (double price) {
	if (price > 0) {
	this.price = price;
	}
	}
	
	public String getModel () {
	return model;
	}
	
	public String getYear () {
	return year;
	}
	
	public double getPrice () {
	return price;
	}
	
	double discountPercentage = (discount / 100);
	
	double discountPrice = discountPercentage - price;
		
	public double getDiscountPrice () {
	return discountPrice;
	}
	
	}
