import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
Scanner in = new Scanner(System.in);
    int n = in.nextInt();
          
                for(int k=1; k<= n; k++)
                {
                  if(k%3==0)
                  {
                  System.out.print(k + ",");
                  }
                  else
                    System.out.print(k);
                 
                           }
               
        
  }
}