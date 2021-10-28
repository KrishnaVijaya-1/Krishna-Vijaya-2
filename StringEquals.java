class StringEquals
{
  public static void main(String[] args)
   {
     String s1="Hello";
     String s2="Hello";
     String str3=new String("Hello");
     String str4=new String("Hello");
     System.out.println(s1==s2);
     System.out.println(s1.equals(s2));
     System.out.println(str3==str4);
     System.out.println(str3.equals(str4));
     System.out.println(str3.equalsIgnoreCase(str4));
   }
}