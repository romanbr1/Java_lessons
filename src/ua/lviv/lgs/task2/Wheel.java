package ua.lviv.lgs.task2;

public class Wheel {
	private int size;

	@Override
	public String toString() {
		return "Wheel [size=" + size + "]";
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void changeSize(int size) {
		this.size=size;
	}
}
