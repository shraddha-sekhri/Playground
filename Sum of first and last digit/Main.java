import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in= new Scanner(System.in);
      int n= in.nextInt();
     int f= n;
      while(f>=10)
      {
        f=f/10;
      }
   
      int l=n%10;
      int sum= f + l;
      System.out.println(sum);
	}
}