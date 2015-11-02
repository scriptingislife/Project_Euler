public class Problem10 {

	public static void main(String[] args){
		int sum = 0;
		for(int i = 2; i < 2000000; i++){
			if(isPrime(i)){
				sum += i;
			}
			
		}//i
		System.out.println("\n" + sum);
		System.exit(0);
	}
	
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
