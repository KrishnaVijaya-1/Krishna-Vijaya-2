class Demo
{
public static void main(String args[])
{
int x=0;
int y=50/x;
System.out.println("y   ="+y);
}
}


#'''Output:Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.main(Tryit.java:6)'''
