import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int d=1;
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
            if(d%2==0)
              System.out.print("#");
            else
              System.out.print("*");
           d++;
          }
         
          System.out.print("\n");
        }
    }
}