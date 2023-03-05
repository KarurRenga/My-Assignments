package week1.day1;

public class AssignFibonacci {
	
			
		public static void main(String[] args) {
		int firstNum=0;
		int secNum=1; 
		int sum=0;
		System.out.println("First 11 FIBONACCI numbers are :");
		
		
		for (int i = 1; i <=11; i++) {
			System.out.println(firstNum + " ");
			
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum=sum;
			//System.out.println(sum);
			
		}
		
		
	}

}
