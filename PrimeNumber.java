package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 int n = 7;
     boolean orange = false;
     for(int i = 2; i <= n/2; ++i)
     {
         if(n % i == 0)
         {
             orange = true;
         }
     }

     if (!orange)
         System.out.println(n + " is a prime number.");
     else
         System.out.println(n + " is not a prime number.");	

}
}
