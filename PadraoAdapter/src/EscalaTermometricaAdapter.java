
public class EscalaTermometricaAdapter implements Temperatura {

	@Override
	public float showTemperatura(float valor, char s) {
		if(s == 'c') {
			float temperaturaCelsius = new EscalaTermometrica().temperaturaCelsius(valor);
			return temperaturaCelsius;
		} else if (s == 'f') {
			float temperaturaFahrenheit = new EscalaTermometrica().temperaturaFahrenheit(valor);
			return temperaturaFahrenheit;
		} else if (s == 'k'){
			float temperaturaKelvin = new EscalaTermometrica().temperaturaKelvin(valor);
			return temperaturaKelvin;
		} else {
			return (Float) null;
		}
	}

}
