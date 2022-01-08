package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2) {
		return num1+num2;

	}
	
	public double sub(double num1, double num2) {
		return num1-num2;

	}
	
	public double mul(double num1, double num2) {
		return num1*num2;

	}
	
	public int div(int num1, int num2) {
		return num1/num2;

	}

	public static void main(String[] args) {

		Calculator calc= new Calculator();
		
		int add= calc.add(10, 20);
		System.out.println(add);
		
		double sub= calc.sub(10.2222, 5.2222);
		System.out.println(sub);
		
		double mul= calc.mul(10.11, 5.11);
		System.out.println(mul);
		
		int div= calc.div(10, 5);
		System.out.println(div);
		
		int add2 = calc.add(2, 1);
		System.out.println(add2);
	
		
		
		 
		
		

	}

}
