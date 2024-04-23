package cse305;

import java.util.ArrayList;
import java.util.List;

public class RegisteredUser {
	private List<User> listUser;

	public RegisteredUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
    public void addAccount(User user) {
        listUser.add(user);
    }

    public void removeAccount(User user) {
        listUser.remove(user);
    }


}
