import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=n;
      for(int i=num;i>0;i--)
      {
        int r=i;
        for(int j=1;j<=i;j++)
        {
          System.out.print(r);
        r--;
        }
        System.out.print("\n");
      }
	}
}
