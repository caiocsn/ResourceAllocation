import java.util.ArrayList;
import java.util.Date;

public class Institute {
	private int user_id_count;
	private int resource_id_count;
	private ArrayList<Resource> resources;
	private ArrayList<User> users;
	
	public Institute() {
		this.resources = new ArrayList<Resource>();
		this.users = new ArrayList<User>();
		this.user_id_count = 1;
		this.resource_id_count = 1;
	}
	public boolean addUser(String name, String email, String type) {
		name = name.toLowerCase();
		email = email.toLowerCase();
		type = type.toLowerCase();
		
		if(!(type.contains("student") || type == "teacher" || type == "researcher" || type == "admin"))
			return false;
		
		this.users.add(new User(name,email,type,this.user_id_count));
		this.user_id_count++;
		return true;
	}
	public boolean addResource(String name) {
		this.resources.add(new Resource(name, this.resource_id_count));
		this.resource_id_count++;		
		return true;
	}
	private User getUser(int id) {
		User puser =  new User();
		
		for(int i = 0; i < this.users.size(); i++) {
			puser = this.users.get(i);
			if(puser.getId() == id)
				return puser;
		}
		
		System.out.println("Error: There's no user with id:" + id);
		return null;
	}
	private Resource getResource(int id) {
		Resource presource =  new Resource();
		
		for(int i = 0; i < this.resources.size(); i++) {
			presource = this.resources.get(i);
			if(presource.getId() == id)
				return presource;
		}
		
		System.out.println("Error: There's no resource with id:" + id);
		return null;
	}

	public void userInfo(int id) {
		this.getUser(id).info();
	}
	public int checkDate(Date start, Date end, Date t) {
		if(t.before(end) && t.after(start))
			return 0;
		return 1;
	}
	
	public boolean allocateResource(int admin_id, int resource_id, String name, Date start, Date end) {
		User pUser = getUser(admin_id);
		
		if(pUser == null || pUser.getUser_type().contains("student") ) {
			System.out.println("Error: Invalid admin ID");
			return false;
		}
		
		Resource pResource = getResource(resource_id);
		
		if(pResource == null) {
			System.out.println("Error: Invalid resource ID");
			return false;
		}
		
		for(int i = 0; i < pResource.allocations.size(); i++) {
			Allocation pAllocation = pResource.allocations.get(i);
			if(checkDate(pAllocation.getStart(), pAllocation.getEnd(), start) + checkDate(start,end,pAllocation.getStart()) > 0) {
				System.out.println("Error: This data is not aviable.");
				return false;
			}
		}
		
		pResource.allocations.add(new Allocation(pUser, name, start, end));
		
		return true;
	}

	public void addDescription(int resource_id, String activity_name, String description) {
		Resource pResource = getResource(resource_id);
		
		if(pResource != null) {
			Allocation pAllocation = pResource.getAllocation(activity_name);
			if(pAllocation != null) {
				pAllocation.setActivity_description(description);
			}
		}
	}

	public boolean confirmAllocation(int resource_id, String activity_name) {
			Resource pResource = getResource(resource_id);
		
		if(pResource != null) {
			Allocation pAllocation = pResource.getAllocation(activity_name);
			if(pAllocation != null) {
				if(pAllocation.getActivity_description() != "") {
					pAllocation.setStatus("Allocated");
					return true;
				}
			}
		}
		
		return false;
	}

}
