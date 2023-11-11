package ochiaMa_LE_6_1;

public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	Faculty(String name, String address, int phoneNum, String email, String office, double salary, MyDate hireDate, String officeHours, String rank) {
		super(name, address, phoneNum, email, office, salary, hireDate);
		this.officeHours = officeHours;
		this.rank = rank;
	}
		
	public String getOfficeHours() {
		return this.officeHours;
	}
	public String getRank() {
		return this.rank;
	}
	public void setTitle(String officeHours) {
		this.officeHours = officeHours;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "" + super.toString() + "Faculty's offce hours: " + officeHours + "\n" + "Faculty's rank: " + rank;
    }

}