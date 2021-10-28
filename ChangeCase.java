import java.util.Scanner;
class ChangeCase
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    System.out.println("Uppercase:"+str1.toUpperCase());
    System.out.println("Lowercase:"+str1.toLowerCase());
    String str2=str1.toUpperCase();
    System.out.println("Original:"+str1);
    System.out.println("New:"+str2);
   }
}