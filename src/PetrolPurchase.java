
	public class PetrolPurchase{
	
	private String stationLocation;
	private String typeOfPetrol;
	private int quantityOfPurchaseInLiters;
	private double pricePerLiter;
	private double percentageDiscount;
	
	public  PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityOfPurchaseInLiters, double pricePerLiter, double percentageDiscount) {
	
	this.stationLocation = stationLocation;
	
	this.typeOfPetrol = typeOfPetrol;
	
	if (quantityOfPurchaseInLiters > 0) {
	this.quantityOfPurchaseInLiters = quantityOfPurchaseInLiters;
	}
	
	if (pricePerLiter > 0) {
	this.pricePerLiter = pricePerLiter;
	}
	
	if (percentageDiscount > 0 & percentageDiscount > 100) {
	this.percentageDiscount = (percentageDiscount / 100);
	}}
	
	public String getStationLocation(){
	return stationLocation;}
	
	public String getStation(){return stationLocation;}

	public int getQuantityOfPurchaseInLiters () {
	return quantityOfPurchaseInLiters;
	}
	
	public double getPricePerLiter () {
	return pricePerLiter;
	}
	
	public double getPercentageDiscount () {
	return percentageDiscount;
	}

    	public void setStationLocation (String stationLocation) {
        this.stationLocation = stationLocation;
   	}

    	public void setTypeOfPetrol (String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    	}

    	public void setQuantityOfPurchaseInLiters(int quantityOfPurchaseInLiters) {
        if (quantityOfPurchaseInLiters > 0 & quantityOfPurchaseInLiters < 100) {
        this.quantityOfPurchaseInLiters = quantityOfPurchaseInLiters;
    	}
    	}
    	
    	public void setPricePerLiter (double pricePerLiter) {
        if (pricePerLiter > 0) {
        this.pricePerLiter = pricePerLiter;
    	}
    	}

    	public void setPercentageDiscount () {
        this.percentageDiscount = (percentageDiscount / 100);
    	}

   	protected double purchaseAmount (double netPayment) {
        netPayment = (pricePerLiter * quantityOfPurchaseInLiters) - percentageDiscount;
        return netPayment;
        }
	

}
