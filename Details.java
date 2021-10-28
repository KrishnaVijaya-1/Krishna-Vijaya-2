import java.util.Scanner;
class Details
{
      public static void main(String[] args)
{
           Scanner myObj=new Scanner(System.in);
           System.out.println("Enter name: ");
           String name=myObj.nextLine();
           System.out.println("Enter registarion id: ");
           int regid=myObj.nextInt();
           System.out.println("Name:" +name);
           System.out.println("Registration Id:" +regid);
}
}