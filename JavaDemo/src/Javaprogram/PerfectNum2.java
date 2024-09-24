package Javaprogram;

public class PerfectNum2 {

	public static void main(String[] args) 
	{
	int n=6;
	int sum=0;
	
	for(int i=1; i<=n-1; i++)
	{
		if(n%i==0)
		{
			sum=sum+1;
			
		}
		
	}
	if(sum==n)
	{
		System.out.println("perfect Number");
	}
	else
	{
		System.out.println("Not a perfect Number");
		
	}	
	}

	}


