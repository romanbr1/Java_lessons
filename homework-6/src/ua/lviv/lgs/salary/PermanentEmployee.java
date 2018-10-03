package ua.lviv.lgs.salary;

public class PermanentEmployee extends Employee implements Salary {
	private int msalary;
	
	public PermanentEmployee(String name, String position, int msalary) {
		super(name, position);
		this.msalary = msalary;
	}
	
	@Override
	public String toString() {
		return "PermanentEmployee [msalary=" + msalary + "]";
	}

	@Override
	public int changeSalary(int s) {
		msalary=s;
		System.out.println("Salary changed");
		return msalary;
	}

	@Override
	public void salary() {
		System.out.println(super.toString()+" Month salary= "+msalary);
		
	}


	

	

}
