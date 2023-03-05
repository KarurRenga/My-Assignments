package week1.day1;

public class AssignPrimenumber {
public static void main(String[] args) {
	int number=44;
	int find=0;
		for (int i=2; i<=number/2 ; i++) {
			if (number%i==0)
			{
				System.out.println("The given number "+ number + " is non prime" );
				find=1;
				break;
			}
					
	}
		if(find==0)
		{
			System.out.println("The given number "+ number + " is prime" );
		}
		
		}
}