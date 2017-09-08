import java.util.Date;
public class main {

	public static void main(String[] args) {
		Institute IC = new Institute("Computer Institute");
		IC.addUser("caio", "caiocsn@hotmail.com", "researcher");
		IC.addResource("Room 3");
		IC.allocateResource(1, 1, "Pilot Class", new Date(117,8,7,12,40), new Date(117,8,7,14,20));
		IC.addDescription(1, "Pilot Class", "Test class for project of software class.");
		IC.confirmAllocation(1, "Pilot Class");
		IC.userInfo(1);
		IC.report();
	}

}
