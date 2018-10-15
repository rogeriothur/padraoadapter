
public class EscalaTermometrica {

	public float temperaturaCelsius(float valor) {
		return valor;
	}
	
	public float temperaturaFahrenheit(float valor) {
		float tempFah = (valor * 9/5) + 32;
		return tempFah;
	}
	
	public float temperaturaKelvin(float valor) {
		float tempKelvin = (valor + 273.15f);
		return tempKelvin;
	}
}
