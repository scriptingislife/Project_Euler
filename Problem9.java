
public class Problem9 {

	public static void main(String[] args){
	
		for(int a = 1; a < 1000; a++){
			for(int b = a + 1; b < 1000; b++){
				int c = 1000 - b - a;
				if(c * c == b * b + a * a){
					 System.out.println("a*b*c = " + a + "*" + b + "*" + c + " = " + a*b*c);
				}
			}
		}
		
	}
	
}
