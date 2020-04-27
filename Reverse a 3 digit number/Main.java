import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
      int n = in.nextInt();	
      int f = n/100;
    int a = n % 100;
    int s = a/10;
    int t = n % 10;
    int t1 = t*100;
    int s1 = s*10;
    int n1 = t1+s1+f;
    System.out.println(n1);
  }
}