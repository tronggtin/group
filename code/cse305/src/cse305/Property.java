package cse305;

public class Property {
	private String propertyID;
	private String description;
	private String propertyOwnerID;

	public Property(String propertyID, String description, String propertyOwnerID) {
		super();
		this.propertyID = propertyID;
		this.description = description;
		this.propertyOwnerID = propertyOwnerID;
	}

	public String getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(String propertyID) {
		this.propertyID = propertyID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPropertyOwnerID() {
		return propertyOwnerID;
	}

	public void setPropertyOwnerID(String propertyOwnerID) {
		this.propertyOwnerID = propertyOwnerID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
