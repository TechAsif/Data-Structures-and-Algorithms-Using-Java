// A school method based Java program to 
// check if a number is prime 
import java.util.*; 

class GFG { 
	
	// function check whether a number 
	// is prime or not 
	static boolean isPrime(int n) 
	{ 
		// Corner case 
		if (n <= 1) 
			return false; 
	
		// Check from 2 to n-1 
		for (int i = 2; i < n; i++) 
			if (n % i == 0) 
				return false; 
	
		return true; 
	} 
	
	/* Driver program */
	public static void main(String[] args) 
	{ 
		if(isPrime(10))
		System.out.println(" true") ; 
		
		else
		System.out.println(" false"); 
		
	} 
} 
	
