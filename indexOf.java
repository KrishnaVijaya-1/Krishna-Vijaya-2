import java.util.Scanner;
class indexOf
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    String st1=sc.nextLine();
    String st2=sc.nextLine();
    if(st1.indexOf(st2)==1)
       System.out.println("Sub string not found");
    else
      System.out.println("Found at"+st1.indexOf(st2));
   }
}
     