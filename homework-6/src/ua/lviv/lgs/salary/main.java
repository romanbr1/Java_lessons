package ua.lviv.lgs.salary;

public class main {

	public static void main(String[] args) {
		PermanentEmployee p = new PermanentEmployee("Ivan", "manager", 10000);
		HiredEmployee h = new HiredEmployee("Petro", "engineer", 300, 5);
		
		p.salary();
		p.changeSalary(5000);
		p.salary();
		
		h.salary();
		h.changeSalary(350);
		h.salary();
	}

}
