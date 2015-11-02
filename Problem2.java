public class Problem2 {

    public static void main(String[] args){
    		//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
            int num = 2; //leading number
            int num2 = 1; //second number
            int sum = 2; //first EVEN fibonacci number
            while(num <= 4000000){ //values do not exceed 4,000,000
                    int fibNum = num + num2;
                    System.out.printf("%-5d %-5d %-5d\n",num2, num, fibNum);//All Fibonacci numbers
                    if(fibNum%2 == 0){ //only even valued numbers
                            sum += fibNum;
                    }
                    num2 = num; //following becomes next in the sequence
                    num = fibNum; //lead number becomes the newest Fibonacci number    
            }
            System.out.println("Sum is: " + sum); 
    }

}
