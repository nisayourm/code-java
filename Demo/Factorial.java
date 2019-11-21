package Demo;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String text = "Factorail number of 5 is:";
		long factorial = 1;
		for(int i = 1; i<= num; i++) {
			factorial *= i;
		}
		System.out.println("Factorail number of 5 is:"+text+factorial);
	}

}
