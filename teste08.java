import java.util.Scanner;


public class teste08 {

	public static void main(String[] args) {

		Scanner sub = new Scanner(System.in);

		int a , b, c, d, diferenca;
		
		a = sub.nextInt();
		
		b = sub.nextInt();
		
		c = sub.nextInt();
		
		d = sub.nextInt();
		
		diferenca = (a * b- c * d);
		
		System.out.printf("Resultado = " + diferenca);
		
		sub.close();
	}

}
