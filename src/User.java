import java.util.ArrayList;

public class User {
	private String name;
	private String email;
	private String user_type;
	private int id;
	private ArrayList<Allocation> allocations;
	
	public User() {
		this.allocations = new ArrayList<Allocation>();
	}
	
	public User(String name, String email, String user_type, int id) {
		this.name = name;
		this.email = email;
		this.user_type = user_type;
		this.id = id;
		this.allocations = new ArrayList<Allocation>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void info() {
		System.out.println("ID:" + id);
		System.out.println("Name:" + getName());
		System.out.println("Email:" + getEmail());
		System.out.println("User type:" + getUser_type());
		System.out.println("---- Allocations ----");
		for(int i = 0; i < allocations.size(); i++)
			allocations.get(i).info();
		System.out.println("-----    END    -----");
	}
	
	public boolean addAllocation(Allocation allocation) {
		if(allocation == null)
			return false;
		
		this.allocations.add(allocation);
		return true;
	}
}
