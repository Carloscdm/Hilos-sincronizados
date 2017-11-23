package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Cuenta c = new Cuenta (40, 700);
		Persona p1 = new Persona("Pedro", c);
		Persona p2 = new Persona("Luis", c);
		
		p1.start();//se inicia el hilo
		p2.start();
	}

}
