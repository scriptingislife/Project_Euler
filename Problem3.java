public class Problem3{
	
	public static void main(String[] args){
	
		long num = 600851475143L; //The number given
		//int num = 13195; //Test number
		int highestFactor = 0; //Finding the largest factor of num
		for(int i = 2; i <= num;i++){ //all numbers other than one up to num
			if(num%i == 0){ //if the number is a factor:
				num /= i; //divide the number by the factor
				if(i > highestFactor){ //if this factor is higher than the previous, make it the largest one so far
					highestFactor = i;	
				}
			}
		}//for
		
		System.out.println(highestFactor); //give us the answer
		
	}//main
	
}
