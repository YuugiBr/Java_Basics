import java.util.Locale;

public class teste03 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: \n %s, seu pre�o � R$%.2f%n %s, seu pre�o � R$%.2f%n", product1,price1,product2,price2);
		System.out.printf("Recorde: %d anos, %d c�digos e seu g�nero � %s\n", age,code,gender);
		System.out.printf("A medida com 10 decimais � %.8f\n Com 3 decimais %.3f\n", measure,measure);
		Locale.setDefault(Locale.US);
		System.out.printf("A medida nos EUA � %.3f\n",measure);
	}
}
