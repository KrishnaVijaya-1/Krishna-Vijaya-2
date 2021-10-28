import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestBR{
   public static void main(String[]args) throws Exception
    {
      BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
      String X=reader.readLine();
      System.out.println(X);
   }
}

