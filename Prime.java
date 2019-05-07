
		


// 	//todo: write a method isPrime which tells you if a given number is a prime or not
// 	//then, write another method findDoublette which takes an integer value as input and 
// 	//is looking for the first prime-doublette it findes. A prime-doublette consists of
// 	//two prime values with the difference of 2 (e.g. 3 and 5).
// 	//The function should return the smaller one of the doublette. If there exists no
// 	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
// 	//the function should return 0.
		
	


import java.util.Scanner;


public class Prime {
	
	public static void main(String[] args) {
		
		
		Scanner	in= new Scanner(System.in);
	

		System.out.println("Enter the number");
		int number = in.nextInt();
		System.out.println(isPrime(number));
	}
		
		public static boolean isPrime(int number) {
//		 isPrime = true;
		
		for (int i=2; i<number; i++)
			
		{
			
			if (number%i==0)
			{
				return false;
			}
		}
			return true;
		}

		
		
		
	}

	
 
