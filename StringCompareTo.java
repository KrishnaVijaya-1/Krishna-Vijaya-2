class StringComapreTo
{
  public static void main(String[] args)
   {
     String s1="Hello";
     String s2="Hello";
     String s3="Hi";
     String s4="hi";
     System.out.println(s1.compareTo(s2));
     System.out.println(s3.compareTo(s4));
     System.out.println(s3.compareToIgnoreCase(s4));
   }
}