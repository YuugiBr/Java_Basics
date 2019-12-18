import java.lang.Math;

public class teste05 {

	public static void main(String[] args) {
		
		double a, b, c, x1, x2, delta;
		a = 4.0;
		b = 5.0;
		c = 6.0;
		
		delta = (double)Math.pow(b, 2) - 4*a*c;
		
		x1 = (double)(-b - Math.sqrt(delta)) / (a * 2.0);
		x2 = (double)(-b + Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
