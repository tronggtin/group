package model;

import java.util.ArrayList;
import java.util.List;

public class ManagerList extends Manager {
	List<Manager> listManager;

	public ManagerList(String firstName, String lastName, int dateOfBirth, int identity, List<Manager> listManager) {
		super(firstName, lastName, dateOfBirth, identity);
		this.listManager = new ArrayList<>();
	}

	public List<Manager> getListManager() {
		return listManager;
	}

	public void setListManager(List<Manager> listManager) {
		this.listManager = listManager;
	}

	public void addManager(Manager manager) {
		listManager.add(manager);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
