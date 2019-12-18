import java.util.Scanner;

public class teste10 {

	public static void main(String[] args) {

		Scanner main = new Scanner(System.in);
		
		int cod1, num1, cod2, num2;
		float val1, val2, preco;
		
		cod1 = main.nextInt();
		num1 = main.nextInt();
		val1 = main.nextFloat();
		
		cod2 = main.nextInt();
		num2 = main.nextInt();
		val2 = main.nextFloat();
		
		preco = (num1 * val1)+(num2 * val2);
		
		System.out.printf("Total a se pagar R$ %.2f",preco);

		main.close();
	}

}
