public class fibb_sum {
	
	public static void main(String[] args){
		/* ****MY SOLUTION ****/
		int f1 = 1;
		int f2 = 2;
		int sum = 0;
		while(f2 < 4000000) {
			if(f2 % 2 == 0)
				sum += f2; 
			f2 += f1;
			f1 = f2 - f1;
			if(f2 >= 4000000)
				break;
		}
		System.out.println(sum);
		/* ****************BETTER SOLUTION ****************
			
			Golden Ratio:
			
		*/
	}
}