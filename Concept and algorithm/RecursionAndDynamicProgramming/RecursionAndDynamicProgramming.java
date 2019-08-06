public class RecursionAndDynamicProgramming {

 public static void main(String[] args) {


  System.out.println(recursiveFibo(5));
  System.out.println(fibonacci(5));
  System.out.println(fibonacciBottomUp(100000)); //aie value ta uporer gulote dile stackoverflow dekhai but 
  //Bottom Up approach a sundor kaj kore tai..aie approach a dynamic programming kora valo


 }

 //This is normal recursion not dynamic programming and top down approach
 static int recursiveFibo(int n) {

  if (n == 0)
   return 0;
  if (n == 1)
   return 1;

  return recursiveFibo(n - 1) + recursiveFibo(n - 2);
 }

 //Recursion with memoization some people call this memoization but we can call dynamic programming
 //It is also TopDown Approach

 static int fibonacci(int n) {
  return fibonacci(n, new int[n + 1]);
 }

 static int fibonacci(int i, int[] memo) {
  if (i == 0 || i == 1) return i;

  if (memo[i] == 0) {

   memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
  }
  return memo[i];
 }

 //Bottop Up appraoch most people call this dynamic programming
 static int fibonacciBottomUp(int n) {
  if (n == 0) return 0;
  else if (n == 1) return 1;

  int[] memo = new int[n];
  memo[0] = 0;
  memo[1] = 1;
  for (int i = 2; i < n; i++) {
   memo[i] = memo[i - 1] + memo[i - 2];
  }

  return memo[n - 1] + memo[n - 2];
 }

}