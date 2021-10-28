import java.util.Scanner;
class StringOccur
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String st1=sc.nextLine();
    char ch=sc.next().charAt(0);
    if(st1.indexOf(ch)==-1)
      System.out.println("Character is not found");
    else if(st1.indexOf(ch,st1.indexOf(ch)+1)==-1)
        System.out.println("Character Only Once at"+st1.indexOf(ch));
    else
      System.out.println("Character occured more than once"+st1.indexOf(ch)+"and also at"+st1.indexOf(ch,st1.indexOf(ch)+1));
  }
}
