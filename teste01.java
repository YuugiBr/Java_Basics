import java.util.Locale;

public class teste01 {

	public static void main(String[] args) {

		double y = 10.2344652;
		System.out.println(y);
		System.out.printf("%.2f\n",y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n",y);
		System.out.println("Resultado ="+ y + "M");
		System.out.printf("Resultado = %.2f M\n", y);
	}

}
