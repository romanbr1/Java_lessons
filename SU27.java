
public class SU27 extends Plane implements SpecialFeatures {
	int maxspeed;
	String color;
	PlaneControl planeContr = new PlaneControl();
	public void moveUp() {
		planeContr.moveUp();
		
	}
	public void moveForward() {
		planeContr.moveForward();
		
	}
	public void moveDown() {
		planeContr.moveDown();
		
	}
	public void moveBack() {
		planeContr.moveBack();
	}
	Randomable randm = new Randm();
	Randomablemax randmax = new Randmax();

	public SU27(int length, int width, int weight, int maxspeed, String color) {
		super(length, width, weight);
		this.maxspeed=maxspeed;
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "SU27"+ super.toString() + "maxspeed=" + maxspeed + ", color=" + color + " ";
	}
	
	@Override
	public void nuclearStrike() {
		System.out.println("����! �������  "+randmax.randmax(10)+" ������� ���������");
	}
	@Override
	public void turbo() {
		int turbo= maxspeed+randm.rand();
		System.out.println("���������������� ����. �������� " + turbo + " ��");
	}
	@Override
	public void stels() {
		System.out.println("˳���� �� ����� �� " + randm.rand() + " ��");
	}
	
}
	


