package Javaprogram;

public class PalindromNumber {

	public static void main(String[] args)
	{
		int num=12321;
		int originalNum = num;
		int reversedNum=0;
		while(num!=0)
		{
			int lastDigit=num%10;
			reversedNum=reversedNum*10+lastDigit;
			num=num/10;
		}
		if(originalNum==reversedNum)
		{
			System.out.println("The num is palindrom");
		}
		else
		{
			System.out.println("The num is not palindrom");
		}
	}
}

