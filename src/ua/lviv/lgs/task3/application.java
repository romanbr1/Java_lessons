package ua.lviv.lgs.task3;

public class application {

	public static void main(String[] args) {
		Animal a = new Animal("������",25,5);
		System.out.println("����� ������� = "+a.getName()+", �������� ������� = "+a.getSpeed()+", ³� ������� = "+a.getAge()+" ����");
		a.setAnimalInfo("ʳ�", 20, 4);
		System.out.println("����� ������� = "+a.getName()+", �������� ������� = "+a.getSpeed()+", ³� ������� = "+a.getAge()+" ����");
		
	}

}
