import java.util.Scanner;
class Main{
	public static void main (String[] args){
	       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum=0;
      for (int i=1;i<=n;i++)
      {
       sum=sum+i;
      }
      System.out.println(sum);
	}
}