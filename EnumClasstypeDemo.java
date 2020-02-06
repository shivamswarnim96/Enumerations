package Enumerations;

public class EnumClasstypeDemo {

	public static void main(String[] args) {

		AppleClassType ap;
		
		AppleClassType ap1, ap2, ap3;
		
		// Display price of Winesap.
		System.out.println("Winesap costs " + AppleClassType.Winesap.getPrice() + " cents.\n");
		// Display all apples and prices.
		System.out.println("All apple prices:");
		for(AppleClassType a : AppleClassType.values()) {
			System.out.println(a + " costs " + a.getPrice() + " cents.");
			// Obtain all ordinal values using ordinal().
			System.out.println(a + " " + a.ordinal());
		}
		ap = AppleClassType.valueOf("RedDel");
		System.out.println();
		System.out.println("ap contains " + ap);
		System.out.println();
		
		ap1 = AppleClassType.RedDel;
		ap2 = AppleClassType.GoldenDel;
		ap3 = AppleClassType.RedDel;
		
		// Demonstrate compareTo() and equals()
		if(ap1.compareTo(ap2) < 0)
		System.out.println(ap1 + " comes before " + ap2);
		if(ap1.compareTo(ap2) > 0)
		System.out.println(ap2 + " comes before " + ap1);
		if(ap1.compareTo(ap3) == 0)
		System.out.println(ap1 + " equals " + ap3);
		System.out.println();
		if(ap1.equals(ap2))
		System.out.println("Error!");
		if(ap1.equals(ap3))
		System.out.println(ap1 + " equals " + ap3);
		if(ap1 == ap3)
		System.out.println(ap1 + " == " + ap3);
		
	}

}