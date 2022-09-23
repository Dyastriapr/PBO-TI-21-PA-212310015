
public class Latihan01 {
	public static void main(String[] args) {
		int c, k, f;
		float r;
		c = 90;
		
		CelciusToFarenheit();
		r = CelciusToRheamur();
		k = CelciusToKelvin(c);
		System.out.println("convert celcius to reamur");
		System.out.println("r = " + r);
		System.out.println("Convert Celcius to Kelvin");
		System.out.println("k = " + k);
		
	}

	static void CelciusToFarenheit() {
		int c = 90;
		int f = (9/5 * c) + 32;
		System.out.println("convert celcius to fahrenheit");
		System.out.println("c = " + c);
		System.out.println("f = " + f);
	}

	static float CelciusToRheamur() {
		int c = 90;
		int r = (5/4 * c);
		return r;
	}

	static int CelciusToKelvin(int c) {
		int k = (c + 273);
		return k;
	}


	}
	