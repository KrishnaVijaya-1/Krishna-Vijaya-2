import  java.io.BufferedReader;
import java.io.InputStreamReader;
class MarksBR
{
    public static void main(String args[]) throws Exception
     {
          BufferedReader reader=new BufferedReader( new  InputStreamReader(System.in));
          String name=reader.readLine();
          System.out.println("student name:" +name);
          System.out.println("enter the marks of subject1");
          float m1=Float.parseFloat(reader.readLine());
          System.out.println("enter the marks of subject2");
          float m2=Float.parseFloat(reader.readLine());
          System.out.println("enter the marks of subject3");
          float m3=Float.parseFloat(reader.readLine());
          float sum=m1+m2+m3;
          float avg=sum/3;
          System.out.println("average of marks:" +avg);
}
}
