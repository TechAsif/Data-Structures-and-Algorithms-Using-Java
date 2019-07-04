// Java program to illustrate 
// shift operators 

//left shift no problem right shift ar somoy sign bit ta nia problem hoi
public class operators { 
	public static void main(String[] args) 
	{ 

		int a = 5; 
		int b = -10; 

		// left shift operator 
		// 0000 0101<<2 =0001 0100(20) 
		// similar to 5*(2^2) 
		System.out.println("a<<2 = " + (a << 2)); 
      
      //also negative number left shift is no problem
      
      
      System.out.println("b<<2 = " + (b << 2)); 

	} 
} 
