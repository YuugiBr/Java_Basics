import java.util.Scanner;

public class teste04 {

	public static void main(String[] args) {
		
		Scanner nome = new Scanner(System.in);
		
		String x;
		int y;
		
		x = nome.next();
		y = nome.nextInt();
		System.out.printf("Olá %s como vai? \n", x);
		System.out.printf("Sua idade é %d anos? \n", y);
		
		double salario;
		
		salario = nome.nextDouble();
		System.out.printf("O seu salário é de R$%.2f ?", salario);
		
		nome.close();
	}

}
