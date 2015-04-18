package gusano;

import javax.swing.JLabel;

public class hilo extends Thread {
	String funcion;
	JLabel o;

	@Override
	
	
	public void run() {
		
		if (funcion.equalsIgnoreCase("arriba"))
			arriba();
		if (funcion.equalsIgnoreCase("abajo"))
			abajo();
		if (funcion.equalsIgnoreCase("i"))
			izquierda();
		if (funcion.equalsIgnoreCase("d"))
			derecha();

	}

	public hilo(String funcion, JLabel o) {
		
		this.funcion = funcion;
		this.o = o;
	}

	synchronized void  arriba() {
		
		while (true){
			o.setLocation(o.getX(),o.getY() - 1);
			
			try {
				sleep((long)20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	synchronized void abajo() {
		while (true) {

			o.setLocation(o.getX(),o.getY() + 1);
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	synchronized void izquierda() {
		while (true) {
			o.setLocation(o.getX()-1,o.getY());
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	void derecha() {
		while (true) {

			o.setLocation(o.getX() + 1,o.getY());
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
