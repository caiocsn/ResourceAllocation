import java.util.ArrayList;

public class Institute {
	private int id_count;
	private ArrayList<Resource> resources;
	private ArrayList<User> users;
	
	public Institute() {
		this.resources = new ArrayList<Resource>();
		this.users = new ArrayList<User>();
		this.id_count = 1;
	}
	
}
