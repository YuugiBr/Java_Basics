import java.util.Scanner;

public class teste04 {

	public static void main(String[] args) {
		
		Scanner nome = new Scanner(System.in);
		
		String x;
		int y;
		
		x = nome.next();
		y = nome.nextInt();
		System.out.printf("Ol� %s como vai? \n", x);
		System.out.printf("Sua idade � %d anos? \n", y);
		
		double salario;
		
		salario = nome.nextDouble();
		System.out.printf("O seu sal�rio � de R$%.2f ?", salario);
		
		nome.close();
	}

}
