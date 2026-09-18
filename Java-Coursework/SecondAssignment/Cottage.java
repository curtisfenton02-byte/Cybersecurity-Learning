package SecondAssignment;
public class Cottage { // Cottage class
	// cottage information
	private int number;
	private String type;
	private int maxOccupancy;
	private double price;
	private boolean seaView;
	private boolean petsAllowed;
	// user email
	private String email;

	// produces cottage object with listed data
	public Cottage(int number, String type, int maxOccupancy, double price, boolean seaView, boolean petsAllowed,
			String email) {

		this.number = number;
		this.type = type;
		this.maxOccupancy = maxOccupancy;
		this.price = price;
		this.seaView = seaView;
		this.petsAllowed = petsAllowed;
		this.email = email;
	}

	public boolean isFree() {
		return email.equals("free");// free means cottage is available
	}

	public void reserve(String email) {
		this.email = email;// reserves cottage
	}

	public boolean cancel(String emailToCancel) {// cancels cottage if user enters matching email
		if (email.equals(emailToCancel)) {
			email = "free";
			return true;
		}
		return false;
	}

//getters
	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public int getMaxOccupancy() {
		return maxOccupancy;
	}

	public double getPrice() {
		return price;
	}

	public boolean hasSeaView() {
		return seaView;
	}

	public boolean allowsPets() {
		return petsAllowed;
	}

//Using correct file format to save new data into cottage.txt
	public String toFileFormat() {
		return number + " " + type + " " + maxOccupancy + " " + String.format("%.2f", price) + " " + seaView + " "
				+ petsAllowed + " " + email;
	}

	// displays this cottage information to user
	public String toString() {
		return number + "" + type + " |Max: " + maxOccupancy + "|£" + price + "|SeaView:" + seaView + "|Pets:"
				+ petsAllowed + "|Reserved by:" + email;
	}
}
