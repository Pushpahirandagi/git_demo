package Javaprogram;

public class FactorialNumber 
{
public static void main(String[] args) 
{
	int fact=1; int no=5;
	for(int i=5; i>=1; i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
