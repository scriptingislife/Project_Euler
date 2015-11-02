public class Problem1{

	  public static void main(String[] args){

	          int sum = 0;

	          for(int i = 0;i< 1000;i++){ //every number to 1,000
	                  if(i%3 == 0 || i%5 == 0){ //if the number if divisble by 3 or 5
	                          sum += i; //add the number to the sum
	                          System.out.println(i); //display the number for debugging 
	                  }
	          }

	          System.out.println("Sum is: " + sum); //display the final sum

	  }

	}
