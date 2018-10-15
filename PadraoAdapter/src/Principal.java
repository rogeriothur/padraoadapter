
public class Principal {

	public static void main(String[] args) {
		
		Temperatura temperatura = new EscalaTermometricaAdapter();
		
		System.out.println(temperatura.showTemperatura(30, 'c') + "°C");
		System.out.println(temperatura.showTemperatura(30, 'f') + "°F");
		System.out.println(temperatura.showTemperatura(30f, 'k') + "K");
	}
}
