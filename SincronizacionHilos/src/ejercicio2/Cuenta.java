package ejercicio2;

public class Cuenta {
	private int saldo;
	private int MAX;//saldo maximo
	
	public Cuenta (int s, int max) {
		saldo = s;
		MAX = max;
	}
	public int getSaldo() {
		return saldo;
	}
	public int getMAX() {
		return MAX;
	}
	public void restar(int cantidad) {
		saldo = saldo - cantidad;
	}
	public void sumar(int cantidad) {
		saldo = saldo + cantidad;
	}
	public synchronized void reintegro (int cant, String nombre) {
		System.out.println("/nSe va a retirar saldo (Actual es: "+getSaldo()+" )");
		if(getSaldo()>=cant) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			restar(cant);
			System.out.println(nombre+" retira: "+cant+" (Actual: "+getSaldo()+")");
		}else {
			System.out.println("Saldo insuficiente");
		}
		if(getSaldo()<=0) {
			System.out.println("Saldo negativo");
		}
	}
	public synchronized void ingreso (int cant, String nombre) {
		System.out.println("/nSe va a hacer un ingreso. (Saldo actual: "+getSaldo()+")");
		int supera = getSaldo() + cant;
		if(supera>MAX) {
			System.out.println("No se puede realizar el ingreso");
		}else {
			sumar(cant);
			System.out.println(nombre+ " ingresa: "+cant+". Saldo actual: "+getSaldo());
		}
	}
	
}
