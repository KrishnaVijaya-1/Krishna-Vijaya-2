import java.util.Scanner;
class scanner
{
      public static void main(String[] args)
{
           Scanner myObj=new Scanner(System.in);
           System.out.println("Enter name: ");
           String name=myObj.nextLine();
           System.out.println("Enter subject1 marks:");
          int mark1=myObj.nextInt();
          System.out.println("Enter subject2 marks:");
          int mark2=myObj.nextInt();
          System.out.println("Enter subject3 marks:");
          int mark3=myObj.nextInt();
           System.out.println("Name:" +name);
           System.out.println("Marks total:" +(mark1+mark2+mark3));
           System.out.println("Average:" +((mark1+mark2+mark3)/3));
}
}