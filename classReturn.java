class Return
{
  int a=100;
  int getValue()
  { 
   return a;
  }
  public static void main(String args[])
  {
   Return x=new Return();
   System.out.println(x.getValue());
  }
}
 