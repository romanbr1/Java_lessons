package ua.lviv.lgs.task2;

public class Application {

	public static void main(String[] args) {
		Wheel wheel=  new Wheel();
		Helm helm = new Helm();
		Body body = new Body();
		
		wheel.setSize(16);
		System.out.println(wheel.getSize());
		wheel.changeSize(19);
		
		helm.setDiametr(10);
		System.out.println(helm.getDiametr());
		helm.changeHelmDiametr(12);
		
		body.setLenght(500);
		body.setWidth(180);
		System.out.println(body);
		body.changeDimensions(182, 490);
		
		Vehicle v = new Vehicle("Ford","red","sedan",wheel,helm,body);
		System.out.println(v);
		
		v.setName("Opel");
		System.out.println(v);
		
		
		System.out.println(v.getName());
		v.setName("Mazda");
		System.out.println(v.getName());
		
		System.out.println(v.getColor());
		v.setColor("gold");
		System.out.println(v.getColor());

		System.out.println(v.getType());
		v.setType("hatchback");
		System.out.println(v.getType());
	}

}
