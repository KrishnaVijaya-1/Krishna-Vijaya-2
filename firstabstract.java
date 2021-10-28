abstract class First
{
abstract void disp();
void disp1()
{
System.out.println("In disp1 of first");
}
}
class Second extends First
{
void disp()
{
System.out.println("In second class");
}
}
class Main
{
public static void main(String args[])
{
Second obj=new Second();
obj.disp();
obj.disp1();
}
}