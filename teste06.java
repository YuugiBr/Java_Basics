import java.util.Scanner;


public class teste06 {

	public static void main(String[] args) {

		
		
		Scanner soma = new Scanner(System.in);
		
		int res, x, y;
		
		x = soma.nextInt();
		
		y = soma.nextInt();
		
		res = x + y;
		
		System.out.printf("O resultado é: %d", res);
		
		soma.close();
	}

}
