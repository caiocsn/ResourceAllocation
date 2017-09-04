import java.util.ArrayList;

public class Resource {
	private int id;
	private String name;
	public ArrayList<Allocation> allocations;
	
	public Resource() {
		this.allocations = new ArrayList<Allocation>();
	}
	
	public Resource(String name, int id) {
		this.id = id;
		this.name = name;
		this.allocations = new ArrayList<Allocation>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Allocation getAllocation(String name) {
		Allocation pAllocation;
		
		for(int i = 0; i < this.allocations.size();i++) {
			pAllocation = this.allocations.get(i);
			if(pAllocation.getActivity_name() == name)
				return pAllocation;
		}
		
		System.out.println("Error: Invalid activity name");
		return null;
	}
}
