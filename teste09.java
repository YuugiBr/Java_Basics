import java.util.Scanner;


public class teste09 {

	public static void main(String[] args) {

		Scanner funcionario = new Scanner(System.in);
		
		int num, horas;
		float sal, trab;
		
		num = funcionario.nextInt();
		horas = funcionario.nextInt();
		trab = funcionario.nextFloat();
		
		sal = horas * trab;
		
		System.out.printf("Funcionário = %d\n", num);
		System.out.printf("Salário é = %.2f", sal);
		

		funcionario.close();
	}

}
