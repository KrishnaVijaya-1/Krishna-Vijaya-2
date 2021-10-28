interface Intdemo
{
void display();
}
class ClassOne implements Intdemo
{
void add(int x, int y )
{
System.out.println("The sum is :"+(x+y));
}
public void display()
{
System.out.println("Welcome to interface");
}
public static void main(String args[])
{
ClassOne n=new ClassOne();
n.add(12,5);
n.display();
}
}