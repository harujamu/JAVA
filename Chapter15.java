public class Chapter15 {
	public static void main(String...args) {
		int num1 = 976;
		int num2 = 427;
		System.out.println(num1 + "と" + num2 + "の最大公約数は、" + Euclid(num1,num2) + "です");
	}
	
	static int Euclid(int num1, int num2) {
		int remainder;
		int gcd;

		do {	
			remainder = num1 % num2;
			gcd = num2;
			
			num1 = num2;
			num2 = remainder;
			
		} while(remainder != 0);
		return gcd;
	}
}