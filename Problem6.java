public class Problem6 {

	public static void main(String[] args){
		
		int sumSquares = 0, squareSum = 0;
		
		for(int i = 1; i <=100; i++){ //numbers 1-100
			squareSum += i; //add number to sum, later squared
			int sqare = i * i; //square num
			sumSquares += sqare; //add to the sum of squared numbers
		}
		
		squareSum = squareSum * squareSum; //square the sum
		int difference = squareSum - sumSquares; //take difference
		System.out.println(difference); //here's our answer
	}
	
}
