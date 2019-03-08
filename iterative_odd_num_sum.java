public class OddSumRecursive{
    public static long Summation(long n){
		long sum = 0;
		if(n < 0){
			System.out.println("Input number shoule be positive interger");
		}
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n % 2 != 0){
			for(long i = n; i > 0; i = i - 2)
				sum += i;
		}else{
			for(long i = n-1; i > 0; i = i - 2)
				sum += i;
		}
		return sum;
	 }
    public static void main(String []args){
        long startTime = System.nanoTime();
    	System.out.println(Summation(9999));
 		long stopTime = System.nanoTime();
 		System.out.println(stopTime - startTime);
    }	
}