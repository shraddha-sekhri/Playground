import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in= new Scanner(System.in);
      int number=in.nextInt();
		int fac,sum = 0;
		int n = number;
		while(n != 0)
		{	
			fac = 1;
			int r = n % 10;
		
			for(int i = r ; i >= 1 ; i--)
			fac = fac * i;
	
			sum = sum + fac;
			n=n/10;
		}
		
		if(sum == number)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}