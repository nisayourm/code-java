package Demo;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		int count = 0;
		int average;
		
		do {
			if(i%2 !=0) {
				count +=1;
				sum +=i;
				
			}
			i++;	
			
		}
		while(i<=50);
		average = sum/count;
		System.out.println("The average of add number:"+average);		
	}

}
