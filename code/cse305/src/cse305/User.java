package cse305;

import java.util.Scanner;

public class User {
	private String id;
	private String password;
	private String email;
	private String type;

	public User(String id, String password, String email, String type) {
		this.id = id;
		this.password = password;
		this.email = email;
		this.type = type;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void resetPassword(String newPassword) {
	    setPassword(newPassword);
	    System.out.println("Password reset successfully.");
	}
    public static User createUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter user ID:");
        String id = sc.nextLine();

        System.out.println("Enter password:");
        String password = sc.nextLine();

        System.out.println("Enter email:");
        String email = sc.nextLine();

        System.out.println("Enter type:");
        String type = sc.nextLine();

        return new User(id, password, email, type);
    }
}
