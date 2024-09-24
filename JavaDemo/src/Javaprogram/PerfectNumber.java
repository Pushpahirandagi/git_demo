package Javaprogram;

public class PerfectNumber {

	public static void main(String[] args) {
		int no=6; int sum=0; int copy=no;
		for(int i=1; i<no; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
				
			}
		}
		if(copy==sum)
		{
			System.out.println("perfect Number");
		}
			else
			{
				System.out.println("Not a perfect number");
			}
			
	

	}

}
