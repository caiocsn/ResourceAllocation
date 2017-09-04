import java.util.Date;
import java.util.ArrayList;

public class Allocation {
	private Date start;
	private Date end;
	private String status;
	private User admin;
	private Resource resource;
	private String activity_name;
	private String activity_description;
	private String type;
	private ArrayList<User> users;
	
	public Allocation(User admin, String name, Date start, Date end) {
		this.admin = admin;
		this.start = start;
		this.end = end;
		this.activity_name = name;
		this.users = new ArrayList<User>();
		this.status = "processing allocation";
	}
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public String getActivity_name() {
		return activity_name;
	}
	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}
	public String getActivity_description() {
		return activity_description;
	}
	public void setActivity_description(String activity_description) {
		this.activity_description = activity_description;
	}
	
	public void info() {
		System.out.println("Activity:" + activity_name);
		System.out.println("Activity description:" + activity_description);
		System.out.println("Manager:" + admin.getName());
		System.out.println("Status:" + status);
		System.out.println("Start time:" + start);
		System.out.println("End time:" + end);
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public User getAdmin() {
		return admin;
	}
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	public void addUser(User user) {
		this.users.add(user);
	}

}
