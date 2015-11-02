public class Problem7 {

	public static void main(String[] args){
	
	int ctPrimes = 1; //count number of primes found
	
	for(int i = 3; i < Integer.MAX_VALUE; i++){ //Number being tested
		boolean test = true;
		for(int j=2; j<=i/2; j++){ //all possible factors to test
	        if(i % j == 0){
	        	test = false; //num is divisble by some factor
	        }
	    }//factors
		
		if(test == true){
			ctPrimes++; //we've found a prime
			//System.out.printf("%-5d %-5d\n", i, ctPrimes); //debugging -- show num and ctPrimes
		}
		
		if(ctPrimes == 10001){ //our 10,001st prime
			System.out.println(i); //here's our answer
			System.exit(0); //closes program or else it will display all numbers until the next prime
		}
		
	}//num
	
	}//main

}
