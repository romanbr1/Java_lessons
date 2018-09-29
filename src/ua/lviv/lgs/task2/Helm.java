package ua.lviv.lgs.task2;

public class Helm {
	private int diametr;

	@Override
	public String toString() {
		return "Helm [diametr=" + diametr + "]";
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public void changeHelmDiametr(int diametr) {
		this.diametr=diametr;
	}
	
}
