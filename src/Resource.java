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
	
	public void info() {
		System.out.println("ID:" + this.id);
		System.out.println("Name:" + this.name);
		for(int i = 0; i < this.allocations.size(); i++)
			this.allocations.get(i).info();
	}
	
	public int getAllocated(){
		int count = 0;
		for(int i = 0 ; i < this.allocations.size(); i++)
			if(this.allocations.get(i).getStatus() == "allocated")
				count ++;
		return count;
	}
	
	public int getProcessing(){
		int count = 0;
		for(int i = 0 ; i < this.allocations.size(); i++)
			if(this.allocations.get(i).getStatus() == "processing")
				count ++;
		return count;
	}
	
	public int getInProgress(){
		int count = 0;
		for(int i = 0 ; i < this.allocations.size(); i++)
			if(this.allocations.get(i).getStatus() == "in progress")
				count ++;
		return count;
	}
	
	public int getConcluded(){
		int count = 0;
		for(int i = 0 ; i < this.allocations.size(); i++)
			if(this.allocations.get(i).getStatus() == "concluded")
				count ++;
		return count;
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
