import java.util.Scanner;
class Particularposition
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    String st1=sc.nextLine();  
    int in=sc.nextInt();
    String st2=sc.nextLine();
    st1=st1.substring(0,in)+st2+st1.substring(in+1,st1.length());
   }
}