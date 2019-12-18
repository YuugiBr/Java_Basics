import java.util.Scanner;


public class teste07 {

	public static void main(String[] args) {

		Scanner pi = new Scanner (System.in);

		double raio, area;
		
		raio = pi.nextFloat();
		
		area = 3.14159 * raio * raio;
		

		System.out.printf("Sua área é: %.4f", area);
		
		pi.close();
		
	}
	}