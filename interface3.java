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
System.out.println("Welcome to interfacei");
}
}
class Democlass
{
public static void main(String args[])
{
ClassOne c1=new ClassOne();
IntDemo obj;
obj=c1;
obj.add(10,20);
obj.display();

}
}