package abhay.ss;

public class Employee {
	private String name;
	private int rollno;
	private int mobileno;

	public Employee() {
	}

	public Employee(String name, int rollno, int mobileno) {
		this.name = name;
		this.rollno = rollno;
		this.mobileno = mobileno;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", rollno=" + rollno + ", mobileno=" + mobileno + "";
	}

}
