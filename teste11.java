import java.util.Scanner;


public class teste11 {

	public static void main(String[] args) {

		System.out.println("Com base nos n�meros informados farei c�lculos de geometria: ");
		
		Scanner formulas = new Scanner(System.in);
		
		float a, b, c;
		float triret, circ, trap, quad, ret;
			
		a = formulas.nextFloat();
		b = formulas.nextFloat();
		c = formulas.nextFloat();
		
		triret = (a * c)/2;
		circ = (float) (3.14159 * (c *c));
		trap = (a+b)*c /2;
		quad = b*b;
		ret = a*b;

		System.out.printf("C�lculo do Tri�ngulo Ret�ngulo = %.3f \n", triret);
		System.out.printf("C�lculo do C�rculo = %.3f \n", circ);
		System.out.printf("C�lculo do Trap�zio = %.3f \n", trap);
		System.out.printf("C�lculo do Quadrado = %.3f \n", quad);
		System.out.printf("C�lculo do Ret�ngulo =%.3f \n", ret);
		
		formulas.close();
	}

}
