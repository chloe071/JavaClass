public class Cart {
	private int modelYear;
	private int purchasePrice; //declare purchase price
	private int currentValue;
	
	public void setModelYear(int userYear) {
		modelYear = userYear;
	}
	public int getModelYear() {
		return modelYear;
	}
	// define set purchase price method
	public void setPurchasePrice(int userPrice) {
		purchasePrice = userPrice;
	}
	// define get purchase price method
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void calcCurrentValue(int currentYear ) {
		double depreciationRate = 0.15;
		int carAge = currentYear - modelYear;
		
		//car depreciation formula
		currentValue = (int) Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
	}
	// define print info method
	public void printInfo() {
		System.out.println("Car's information:");
		System.out.println("  Model year: " + modelYear);
		System.out.println("  Purchase price: $" + purchasePrice);
		System.out.println("  Current value: $" + currentValue);
		}
	}
