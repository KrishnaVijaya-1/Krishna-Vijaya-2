class A
{
int a;
A(int val,int val2)
{
a=val+val2;
}
A(int val)
{
this(val,val*2);
a=val;
}
}
class B extends A
{
int b;
B()
{
super(50);
b=20;
System.out.println("In class B constructor");
}
B(int val)
{
super(val*2);
b=val;
System.out.println("a is "+a+" b is "+b);
}
}
class C
{
public static void main(String args[])
{ 



B b1=new B();
System.out.println(b1.a +" " +b1.b);
}
}