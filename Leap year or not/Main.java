import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int y=in.nextInt();
      int year=y/4;
      int year1=y/100;
      if(year%2==0 && year1%2==0 && y%400==0)
        System.out.println("Leap year");
       else
        System.out.println("Non Leap year");
    }
}