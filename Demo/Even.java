package Demo;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while(i <= 50) {
			if(i % 2==0) {
				sum = sum+i;
			}
			i++;
		}
		System.out.println("Sum of even number:"+sum);
	}

}
