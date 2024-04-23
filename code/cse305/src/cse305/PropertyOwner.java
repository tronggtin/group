package cse305;

import java.util.ArrayList;

public class PropertyOwner extends User {

    public PropertyOwner(String id, String password, String email, String type) {
        super(id, password, email, type);
        // TODO Auto-generated constructor stub
    }

    private ArrayList<Property> ListProperty;

    public PropertyOwner(String id, String password, String email, String type, ArrayList<Property> listProperty) {
        super(id, password, email, type);
        ListProperty = listProperty;
    }

    public ArrayList<Property> getListProperty() {
        return ListProperty;
    }

    public void setListProperty(ArrayList<Property> listProperty) {
        ListProperty = listProperty;
    }

    public void listProperties() {
        System.out.println("Owned Properties:");
        for (Property property : ListProperty) {
            System.out.println(property.toString());
        }
    }

    public void addProperty(Property property) {
        ListProperty.add(property);
    }

    public void removeAccount(Property property) {
        ListProperty.remove(property);
    }

}