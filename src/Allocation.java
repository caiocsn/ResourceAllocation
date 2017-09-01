import java.util.Date;

public class Allocation {
	private Date start;
	private Date end;
	private String status;
	private User sponsor;
	private Resource resource;
	
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
	public User getSponsor() {
		return sponsor;
	}
	public void setSponsor(User sponsor) {
		this.sponsor = sponsor;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
}
