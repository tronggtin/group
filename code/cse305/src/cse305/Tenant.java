
import java.util.ArrayList;
import java.util.List;

public class Tenant extends User {

    private ArrayList<RentalContract> rentedProperties;
    private String TenantID;

    public Tenant(TenantBuilder tent) {
        super(tent);
        this.rentedProperties = tent.getList();
        this.TenantID = tent.getTenantID();
    }

    public void setRentedProperties(ArrayList<RentalContract> rentedProperties) {
        this.rentedProperties = rentedProperties;
    }

    public static TenantBuilder tbuilder() {
        return new TenantBuilderImp();
    }

    public List<RentalContract> getRentedProperties() {
        return new ArrayList<>(rentedProperties); 
    }

    public Tenant getTenant() {
        return this;
    }

    public void terminateRentalContract(RentalContract contract) {
        if (rentedProperties.contains(contract)) {
            contract.terminateContract();
            rentedProperties.remove(contract);
            System.out.println("Rental contract terminated successfully.");
        } else {
            System.out.println("Invalid rental contract. Unable to terminate.");
        }
    }

}
