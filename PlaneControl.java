
public class PlaneControl{
Randomable randm = new Randm();

	public void moveUp(){
		System.out.println("˳��� ������ �� "+randm.rand()+" �����");	
	}
	
	void moveDown(){
		System.out.println("˳��� ������ �� "+randm.rand()+" ����");	
	}

	void moveForward(){
		System.out.println("˳��� ������ �� "+randm.rand()+" ������");	
	}

	void moveBack(){
		System.out.println("˳��� ������ �� "+randm.rand()+" �����");	
	}
}
