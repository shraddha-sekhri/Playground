import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      for(int d=1;d<=n;d++)
      {
        if(n%d==0)
        {
          System.out.println(d);
        }
      }
	}
}