package ejercicio2;

public class Persona extends Thread{
	private Cuenta c;
	private String nombre;
	
	public Persona(String nombre, Cuenta c) {
		this.c=c;
		this.nombre = nombre;
	}
	
	public void run() {
		for (int i = 1; i <= 2 ; i++) {
			int aleatorio = (int) (Math.random()*500+1);//número aleatorio entre 1 y 500
			c.ingreso(aleatorio, nombre);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			aleatorio= (int) (Math.random()*500+1);
			c.reintegro(aleatorio, nombre);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
