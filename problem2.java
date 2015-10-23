public class problem2 {

        public static void main(String[] args){
                int num = 1;
                int num2 = 2;
                int sum = 0;
                while(num2 <= 4000000){
                        int temp = num + num2;
                        System.out.println(temp);//Fibonacci Number
                        if(temp%2 == 0){
                                sum += temp;
                                System.out.println("Sum is: " + sum);
                        }
                        num = num2;
                        num2 = temp;
                }
        }

}
