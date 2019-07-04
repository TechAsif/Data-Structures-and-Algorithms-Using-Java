class Test { 
	public static void main(String args[]) { 

	// x is stored using 32 bit 2's complement form. 
	// Binary representation of -1 is all 1s (111..1)	 
	int x = -10; 
    int y = 10;//this will no problem because this is positive  

	System.out.println(y>>>1); // The value of 'x>>>29' is 00...0111 
	System.out.println(x>>>1); // The value of 'x>>>30' is 00...0011 
	System.out.println(x>>>31); // The value of 'x>>>31' is 00...0001 
}	 
} 
