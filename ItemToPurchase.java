
public class ItemToPurchase {
   //private fields
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	
	//default constructor
	public ItemToPurchase() {
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	//mutator methods
	public void setName(String name) {
		itemName = name;
	}
	public void setPrice(int price) {
		itemPrice = price;
	}
	public void setQuantity(int quantity) {
		itemQuantity = quantity;
	}
	//accessor methods
	public String getName() {
		return itemName;
	}
	public int getPrice() {
		return itemPrice;
	}
	public int getQuantity() {
		return itemQuantity;
	}
}
