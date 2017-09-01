
public class Resource {
	private int id;
	private String name;
	private Allocation current;
	
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
	public Allocation getCurrent() {
		return current;
	}
	public void setCurrent(Allocation current) {
		this.current = current;
	}
}
