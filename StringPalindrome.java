import java.util.Scanner;
class StringPalindrome
{
public static void main(String[] args)
{
Scanner myObj=new Scanner(System.in);
String s1=myObj.nextLine();
int flag=0;
int len=s1.length();
for (int i=0;i<len/2;i++)
{      
       if(s1.charAt(i)!=s1.charAt((len-1)-i))
       {
             flag=1;
             break;         
       }
}
if(flag==0)
      System.out.println("Is a Palindrome"); 
else
      System.out.println("Not a Palindrome");
}
}