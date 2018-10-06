
public abstract class Plane {
	private int length; 
	private int width;
	private int weight;
	public Plane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	Randomable randm = new Randm();
	Randomablemax randmax = new Randmax();
	
	
	@Override
	public String toString() {
		return " length=" + length + ", width=" + width + ", weight=" + weight +" ";
	}
	
	void startEngine() {
		System.out.println("�� ������� "+randmax.randmax(20)+","+randmax.randmax(88));
	}
	void takeOff() {
		System.out.println("����� ���� �� "+randmax.randmax(1000)+" ��");
	}
	void landingPlane() {
		System.out.println("˳��� ��� �� �������.");
	}
	
	
}
