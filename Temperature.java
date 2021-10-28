import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Temperature
{
  public static void main(String[]args)throws IOException
    {
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter today's temperature: ");
        float temp = Float.parseFloat(input.readLine());
        System.out.println("Today's temp is:" +temp);
    }
}