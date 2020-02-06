package Enumerations;

enum AppleClassType {
	
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
	
	private int price; // price of each apple
	
	// Constructor
	AppleClassType(int p) {
		price = p; 
	}
	// Overloaded constructor
	AppleClassType() {
		price = -1; 
	}
	int getPrice() {
		return price; 
	}

}
