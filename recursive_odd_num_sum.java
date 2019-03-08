public class OddSumRecursive{
    public static long Summation(long n){
	    if (n <= 1) return n;
	    if (n == 2) return 1;
		if (n%2 == 0) return (n-1) + Summation(n - 3);
		else return (n) + Summation(n-2);
	 }
    public static void main(String []args){
        long startTime = System.nanoTime();
    	System.out.println(Summation(9999));
 		long stopTime = System.nanoTime();
 		System.out.println(stopTime - startTime);
    }	
}