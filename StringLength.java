class StringLength
{
 public static void main(String args[])
  {
    String str1="Hello World";
    String str2=new String("Hello");
    char[] ch={'h','e','l','l','o','.'};
    String str3=new String(ch);
    System.out.println(str1.length());
    System.out.println(str2.length());
    System.out.println(str3.length());
   }
}