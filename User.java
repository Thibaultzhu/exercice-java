import java.util.*;


public class User {
private String username = "dd";
//private String password;
//private String gender ;
//private Date birthday;
//private String email;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username=username;
}


	public static void main(String[] args) {
		User u = new User();
		System.out.println(u.getUsername());
		u.setUsername("asdf");
		u.getUsername();
		System.out.println(u.getUsername());

	}

}
