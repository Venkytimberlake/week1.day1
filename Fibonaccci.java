package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int a=10;
			int first=0;
			int sec=1;
			
			System.out.print("Fibonacci Series of "+a+" numbers:");

		        for (int i = 1; i <= a; i++)
		        {
		            System.out.print(first+",");
		      
	                int sum = first + sec;
		            first = sec;
		            sec = sum;
		        }
		        }
	}}
