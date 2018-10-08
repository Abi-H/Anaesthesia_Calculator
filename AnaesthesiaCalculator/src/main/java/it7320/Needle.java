package it7320;

public class Needle {
	
	double size;
	
	public Needle() {
		this.size = 0;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = Math.ceil(size);		
	}
}
