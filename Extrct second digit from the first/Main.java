import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in= new Scanner(System.in);
      int n= in.nextInt();
     int f= n;
      while(f>=100)
      {
        f=f/10;
      }
   
      int s=f%10;
      System.out.println(s);
	}
}