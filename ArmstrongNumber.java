package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int input = 1;
		int orig=input;
		int sum = 0;
		
		while (input>0) {
			
			int rem= input%10;
			sum = sum+(rem*rem*rem);
			
			
			input = input/10;
			
			//System.out.println(sum);
			
		}
		if (orig==sum) {
			
			System.out.println("armstrong");
			
			
			}
		else {
			System.out.println("not an armstrong");
			
		}
		

	}

}