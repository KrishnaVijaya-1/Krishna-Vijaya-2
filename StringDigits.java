class StringDigits
{
  public static void main(String args[])
   {
    String s1=new String("1Hel1lo1");
    int len=s1.length();
    int ncount=0;
    int lcount=0;
    int ucount=0;
    for(int i=0;i<len;i++)
       {
         if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
            ncount=ncount+1;
         else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
            ucount=ucount+1;
         else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
            lcount=lcount+1;
       }
       System.out.println("No.of Digits are:" +ncount);
       System.out.println("No.of uppercase are:" +ucount);
       System.out.println("No.of lowercase are:" +lcount);
    }
}
    
    

    