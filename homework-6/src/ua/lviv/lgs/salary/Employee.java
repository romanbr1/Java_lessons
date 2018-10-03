package ua.lviv.lgs.salary;

public abstract class Employee {
	private String name;
	private String position;
	
	public Employee(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + "]";
	}

	
	
}
