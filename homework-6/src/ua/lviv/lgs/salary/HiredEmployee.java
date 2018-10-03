package ua.lviv.lgs.salary;

public class HiredEmployee extends Employee implements Salary{
	private int hsalary;
	private int hours;
	
	public HiredEmployee(String name, String position, int hsalary, int hours) {
		super(name, position);
		this.hsalary = hsalary;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "HiredEmployee [hsalary=" + hsalary + "]";
	}

	@Override
	public void salary() {
		System.out.println(super.toString()+" Salary for "+hours+" hours = "+hsalary*hours);
		
	}

	@Override
	public int changeSalary(int s) {
		hsalary = s;
		System.out.println("Salary changed");
		return hsalary;
	}
}
