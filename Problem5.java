public class Problem5 {

	public static void main(String[] args){
		
		int smallNum = Integer.MAX_VALUE;
		boolean test = true;
		
		for(int i = Integer.MAX_VALUE; i > 0; i--){ //All possible numbers, high-low
			test = true; //Test variable
			for(int j = 1; j <= 20; j++){ //Test all numbers 1-20
				if(i%j != 0){//test if num is divible by current number
					test = false; //Num is not divisible by the current number 1-20
				}
			}//1-20
			if(test == true){ //if num is divisble by all numbers
				if(i < smallNum){ //make sure num is smallest
					smallNum = i; //reset smallest number
				}
			}
		}//num
		
		System.out.println(smallNum); //Here's our answer
		
	}//main
	
}
