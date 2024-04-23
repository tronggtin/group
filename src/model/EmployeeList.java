package model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList extends Employee {
	private List<Employee> list;

	public EmployeeList(String firstName, String lastName, int dateOfBirth, int identity, List<Employee> list) {
		super(firstName, lastName, dateOfBirth, identity);
		this.list = new ArrayList<>();
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}	

	public void addEmployee(Employee employee) {
		list.add(employee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
