
public class Triangle {
	public static final int SCALENE = 1; 
	public static final int ISOSCELES = 2; 
	public static final int EQUILATERAL = 3; 
    
	public static int getType(int a, int b, int c) {
		if ((a==b) && (b==c)) {
			return EQUILATERAL;
		} else if ((a==b) || (b==c) || (a==c)) {
			return ISOSCELES;
		} else {
			return SCALENE;
		}
	}

}
