package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("The size of the desktop monitor is 24 inches");

	}
	
	public static void main(String[] args) {
		
		Desktop pc = new Desktop();
		pc.computerModel();
		pc.desktopSize();

	}

}
