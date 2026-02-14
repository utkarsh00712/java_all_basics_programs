package Sigelton;

public class PrimeMinisterApp {
public static void main(String[] args) {
	PrimeMinister pm1 = PrimeMinister.getInstance("Modi", "BJP", 75, 3);
	System.out.println(pm1);
	
	PrimeMinister pm2 = PrimeMinister.getInstance("Uppi", "BJD", 55,1);
	System.out.println(pm2);
}
}
