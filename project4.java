public class problem4 {

	public static void main(String[] args){
		int largestNum = 0;
		for(int i = 100; i < 1000; i++){ //first number
			for(int j = 100; j < 1000; j++){ //second number
				
				int num = i * j; //test all numbers 100-999 with the first number
				String strNum =new Integer(num).toString(); //Convert to a string to determine palindrome
				int digit = strNum.length() - 1; //last digit place
				boolean test = true; //test variable
				for(int k = 0; k < strNum.length();k++){ //all digit places
					if(strNum.charAt(k) != strNum.charAt(digit)){//if first and last digits match
						test = false; //num is not a palindrome
					}
					digit--;//one lower digit place
				}//digit places
				if(test == true){ //if num is a palindrome
					if(num > largestNum){ //num should be the largest, but let's make sure
						largestNum = num;
					}
				}
				
			}//num 2
		}//num1
		
		System.out.println(largestNum);
		
	}//main
}
